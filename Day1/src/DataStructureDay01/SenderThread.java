package DataStructureDay01;

import java.net.*;
import java.io.*;

public class SenderThread extends Thread {
	Socket socket;
	String name;

	SenderThread(Socket socket, String name) { // 생성자로 socket과 name을 받는다. 
		this.socket = socket;
		this.name = name;
	}

	public void run() { //Thread 오버라이딩
		try { //예외처리
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //키보드 입력값을 읽는 BufferedReader객체 reader를 생성
			PrintWriter writer = new PrintWriter(socket.getOutputStream()); //소켓의 출력 스트림을 이용하여 PrintWriter 객체 writer를 생성

			// 제일 먼저 서버로 대화명 송신한다.
			writer.println(name); // 닉네임을 서버로 송신
			writer.flush(); // 버퍼를 비운다. 

			// 키보드로 입력된 메시지를 서버로 송신
			while (true) { //무한루프 시작
				String str = reader.readLine(); //키보드에서 한 줄을 읽어와서 변수 str에 저장한다. 
				if (str.equals("bye"))
					break;
				writer.println(str); //str을 서버로 송신한다. 
				writer.flush();
			}
		} catch (Exception e) { //예외처리
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close(); //소켓을 닫음
			} catch (Exception ignored) {
			}
		}
	}
}
