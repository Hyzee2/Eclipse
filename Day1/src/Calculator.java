import java.util.Scanner;

public class Calculator {
	public static void main(String args[]){

		//변수선언
		Scanner sc;
		sc = new Scanner(System.in);
		int num1;
		int num2;
		String answer;
		
		//입력기능
		do {		
			System.out.println("첫번째 수를 입력하세요: ");
			num1 = sc.nextInt();
			System.out.println("두번째 수를 입력하세요: ");
			num2 = sc.nextInt();
		
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
			
			System.out.println("계산을 계속하시겠습니까?(계속하면 Y를 눌러주세요) ");
			answer = sc.next();

			} while(answer.equals("Y")||answer.equals("y"));  //while 조건식은 do 안에서 변수 선언하면 찾지 못한다. do 밖에 main에서 선언해줘야 함!
		System.out.print("계산을 종료합니다.");
	}

}
