package DataStructureDay01;

import java.net.*;
import java.util.Scanner;

public class ClientExample { // 클라이언트

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 닉네임 입력값으로 받기 위함
		System.out.println("채팅방에 사용할 이름을 입력하세요.");

		if (args.length != 1) { 
			System.out.println("Usage: java ClientExample4 <Superman>");
			return;
		}
		try {
			// 서버와 연결
			Socket socket = new Socket("LocalHost", 9002); //9002 포트의 LocalHost 서버와 연결하여 소켓 생성

			// 메시지 송신 쓰레드와 수신 쓰레드 생성해서 시작
			Thread thread1 = new SenderThread(socket, sc.next()); //SenderThread 생성자로 만들어진 소켓을 넣고, 이름으로 사용하기 위해 입력 받는다.
			Thread thread2 = new ReceieverThread(socket); 

			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
