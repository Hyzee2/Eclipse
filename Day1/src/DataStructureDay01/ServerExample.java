package DataStructureDay01;

import java.net.*;
public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9002); //포트 9002로 새로운 서버소켓 생성
            while (true) { //무한루프
                Socket socket = serverSocket.accept(); //서버소켓이 클라이언트 응답이 있기까지 기다림
                Thread thread = new PerClinetThread(socket); //Perclinet쓰레드 생성! 만들어진 소켓에 클라이언트 응답이 들어오면 
                thread.start();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage()); //메세지를 받지 못한 경우를 대비하여 예외발생
        }
	}

}
