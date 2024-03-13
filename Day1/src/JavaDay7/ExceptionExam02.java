package JavaDay7;
import java.util.Scanner;

public class ExceptionExam02 extends Exception{ // Exception 상속을 받아서 오버라이딩해서 예외처리 사용하기!

	public static void main(String[] args) throws ArithmeticException, InterruptedException { //예외처리 던지기 throws. throws 다음에 쓰는 클래스는 Exception처럼 너무 광범위하기보다는 구체화된 클래스로 선택하는 것이 낫다
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); 
		System.out.println(3/num);
		
//		try { //try-catch문은 예외처리 직접 처리하기
//			Thread.sleep(3000); // 결과값이 나올때까지 잠깐 시간 늘이기(3000 = 3초)
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		
		Thread.sleep(3000); // Thread.sleep()는 무조건 try-catch문 필요
		
		System.out.println("Bye");
	}

}
