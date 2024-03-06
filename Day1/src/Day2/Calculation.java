package Day2;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) { //메서드 실행 값들을 표출해내는 내용을 작성, main 함수는 순서대로 실행된다. 
		char answer;
		
		Calculation cal = new Calculation();
		
		do {
			Scanner sc;
			sc = new Scanner(System.in);
		
			//화면에 나오는 부분
			System.out.println("첫번째 수를 입력하세요");
			int num1 = cal.insert(sc); 
		
		
			System.out.println("연산자를 입력하세요");
			char op = cal.insert_ch(sc); 
		
		
			System.out.println("두번째 수를 입력하세요");
			int num2 = cal.insert(sc); 
	
		
			cal.result(num1, num2, op); //출력함수 
			
			System.out.println("계산을 계속하시겠습니까?(계속하면 Y를 눌러주세요)");
			answer = cal.insert_ch(sc);
			
		} while(answer == 'Y' || answer == 'y');
		System.out.print("계산을 종료합니다.");
	}
	public  int insert(Scanner sc) { //수를 입력받는 함수. CallbyReference로 sc 객체
		int num = sc.nextInt();
		return num;
	}
	public  char insert_ch(Scanner sc) { //연산자를 입력받는 함수
		char op = sc.next().charAt(0);
		return op;
	}
	public  int plu(int num1, int num2) { //더하기 연산하는 함수
		int result = num1 + num2 ;
		return result;
	}
	public  int min(int num1, int num2) { //빼기 연산하는 함수
		int result = num1 - num2 ;
		return result;
	}
	public  int mul(int num1, int num2) { //곱하기 연산하는 함수
		int result = num1 * num2 ;
		return result;
	}
	public  double div(int num1, int num2) { //나누기 연산하는 함수
		double result = (double)num1 / num2 ;
		return result;
	}
	public  void result(int num1, int num2, char op) { //결과를 출력하는 함수, 매개변수는 3개를 받아야 한다. 
		double result = 0; // 받는 result 값을 double 형태로 초기화 해줌.
		
		Calculation cal = new Calculation();
		
		switch(op) {
		case '+' :
			result = cal.plu(num1, num2); //더하기 연산 함수를 실행시키고, 그 결과 값을 result에 넣어준다. 
			break;
		case '-' :
			result = cal.min(num1, num2);
			break;
		case '*' :
			result = cal.mul(num1, num2);
			break;
		case '/' :
			result = cal.div(num1, num2);
			break;
			
		}
		System.out.println(num1 +""+ op +""+ num2 +"=" + result);
	}
}
