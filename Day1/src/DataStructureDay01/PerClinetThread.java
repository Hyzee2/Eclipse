package DataStructureDay01;

import java.io.*;
import java.net.*;
import java.util.*;

public class PerClinetThread extends Thread { 

	// ArrayList 객체를 여러 스레드가 안전하게 공유할 수 있는 동기화된 리스트로 만듭니다.
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>()); // 동기화된 리스트를 생성하여 클라이언트의 PrintWriter 객체를 저장한다. 

	Socket socket;
	PrintWriter writer;

	PerClinetThread(Socket socket) { 
		this.socket = socket;
		try { //예외처리
			writer = new PrintWriter(socket.getOutputStream()); // 소켓의 출력스트림을 이용하여 PrintWriter 객체 writer를 생성
			// writer는 클라이언트와의 통신을 담당하는 PrintWriter 객체이다. 이 객체는 클라이언트의 소켓을 통해 데이터를 보낼 수 있다. 
			list.add(writer); //리스트에 writer를 추가한다. 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void run() {
		String name = null;
		try { //예외처리
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //소켓의 입력 스트림을 이용하여 BufferedReader 객체 reader를 생성한다. 
			// 1. socket.getInputStream() : socket 객체에서 입력 스트림을 가져온다. 소켓은 데이터를 주고받기 위한 통로이며, 입력 스트림은 서버로부터 데이터를 읽어오는 역할
			// 2. new InputStreamReader : 입력 스트림을 읽어들이는 Reader클래스의 객체를 생성. 바이트 스트림을 문자 스트림으로 변환해주는 역할
			// 3. new BufferedReader : 버퍼링을 제공. 입출력 속도를 향상시켜 효율적인 문자열 읽기를 위해 사용된다. 
			
			name = reader.readLine(); //첫번째 줄을 읽어와 name에 저장
			sendAll("#" + name + "님이 들어오셨습니다"); // sendAll: 모든 클라이언트로 해당 메시지를 보낸다. 
			while (true) { // 무한루프
				String str = reader.readLine(); //클라이언트로부터 한 줄을 읽어와 변수 str에 저장
				if (str == null)
					break;
				sendAll(name + ">" + str); // 수신된 메시지 앞에 대화명을 붙여서 모든 클라이언트로 송신
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { //예외가 발생되더라도 다음 블록 실행 
			list.remove(writer); //리스트에서 writer를 제거한다. 
			sendAll("#" + name + "님이 나가셨습니다"); // 사용자가 채팅을 종료했다는 메시지를 모든 클라이언트로 보냅니다.
			try {
				socket.close();
			} catch (Exception ignored) {
			}
		}
	}

	// 서버에 연결되어 있는 모든 클라이언트로 똑같은 메시지를 보냅니다.
	private void sendAll(String str) {
		for (PrintWriter writer : list) { // 리스트에 있는 모든 PrintWriter 객체를 반복
			writer.println(str); // 해당 PrintWriter 객체로 메시지를 보낸다. 
			writer.flush(); // 버퍼를 비운다. 
		}
	}
}
