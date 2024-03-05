/*
 * java는 100% 상속구조
 * java는 100% 객체지향언어(=무조건 객체를 사용. class 문법 사용)
 * 모든 프로그램은 시작과 끝을 담당하는 함수를 정의 = main 함수
 * java에서 함수는 method(메소드)라고 부른다. 
 */

//패키지
//임포트 : api 가져다가 쓴다는 의미
import java.util.Scanner;

public class Hello { // 아직 Hello라는 클래스가 만들어진 건 아니고, 만들 예정이라고 선언해주는 코드 
	public static void main(String []args) {    // 프로그램을 시작해주고 끝내줌. 프로그램 전체에서 1개, 매 클래스마다 X 
		
		Scanner sc; //new를 쓰지 않아서 아직 객체가 안 만들어진 상태 
		sc = new Scanner(System.in); //키보드로 입력
		
		String str = sc.next();
		int num = sc.nextInt();
		
		System.out.println(str);
		System.out.println(num);
		
	}
}
