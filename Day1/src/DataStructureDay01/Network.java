package DataStructureDay01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network {

	public static void main(String[] args) throws UnknownHostException { // 호스트 못 찾을 때 예외처리 반드시 필수!
		
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.printf("호스트 이름 : %s %n", iaddr.getHostName());
		System.out.printf("호스트 IP주소 : %s %n", iaddr.getHostAddress());
		
		
		iaddr = InetAddress.getByName("www.google.com");
		System.out.printf("호스트 이름 : %s %n", iaddr.getHostName());
		System.out.printf("호스트 IP주소 : %s %n", iaddr.getHostAddress());
		
		InetAddress sw[] = InetAddress.getAllByName("www.kbstar.com");
		for(InetAddress temp_sw : sw) {
			System.out.printf("호스트 이름 : %s %n", temp_sw.getHostName());
			System.out.printf("호스트 IP주소 : %s %n", temp_sw.getHostAddress());
		}
	}

}
