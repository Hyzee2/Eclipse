package DataStructureDay01;

import java.io.*;
import java.net.*;

public class ReceieverThread extends Thread {
	Socket socket;

	ReceieverThread(Socket socket) {
		this.socket = socket;
	}

	public void run() { 
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //소켓의 입력스트림을 이용하여 BufferedReader 객체 reader 생성
			while (true) {

				// 서버로부터 수신된 메시지를 모니터로 출력
				String str = reader.readLine(); // 서버로부터 한 줄을 읽어와 변수 str에 저장한다. 
				if (str == null)
					break;
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
