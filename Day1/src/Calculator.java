import java.util.Scanner;

public class Calculator {
	public static void main(String []args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		System.out.println("부호를 입력하세요: ");
		//String button = sc.next(); //str은 한 글자, String은 문자열을 입력하는 내장 클래스 
		
		char button = sc.next().charAt(0);
		
		switch(button) {
		case '+' :
			int plus = num1 + num2;
			System.out.println(num1 + "+" + num2 + "="+ plus );
			break;
		case '-' :
			int minus = num1 - num2;
			System.out.println(num1 + "-" + num2 + "="+ minus );
			break;
		case '*' :
			int multiple = num1 * num2;
			System.out.println(num1 + "*" + num2 + "="+ multiple );
			break;
		case '/' :
			int divide = num1 + num2;
			System.out.println(num1 + "/" + num2 + "="+ divide );
			break;
		default :
			System.out.println("잘못된 입력 입니다.");
			break;
		}
		
		
	}
	
}
