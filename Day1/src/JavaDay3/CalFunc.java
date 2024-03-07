package JavaDay3;

import java.util.Scanner;

import Day2.Calculation;
//setter, getter, 출력
public class CalFunc {
	
	
	public static void main(String[] args) {   // main은 외부라고 생각. 그래서 클래스랑 동일한 객체 생성 필요. 사용자 입장에서 작성. 메서드 위주로 작성
		
		CalFunc cf = new CalFunc();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("첫번째 값을 입력하세요. ");
			cf.setN1(sc.nextInt());	  // 메서드 내부에서는 Scanner를 사용 안하는게 좋음!
			System.out.println(cf.getN1());
		
			System.out.println("부호를 입력하세요. ");
			cf.setOp(sc.next().charAt(0));
			System.out.println(cf.getOp());
		
			System.out.println("두번째 값을 입력하세요. ");
			cf.setN2(sc.nextInt());
			System.out.println(cf.getN2());
		
			cf.result(cf.getN1(), cf.getN2(), cf.getOp());
			
			System.out.println("계산을 계속하시겠습니까?(계속하면 Y를 눌러주세요)");
			cf.setAns(sc.next().charAt(0));
		} while(cf.getAns() == 'Y' || cf.getAns() == 'y');
		
		System.out.print("계산을 종료합니다.");
	}
	
	
	
	private int num1;   // 필드는 초기화 불필요. 객체 생성될 때마다 디폴트로 생성자 함수가 초기화 시켜줌.
	private int num2;
	private char op;
	private char answer;
	
	// =================생성자 함수==========================
	public CalFunc() {  // 매개변수 받는게 없는 생성자 함수가 디폴트 함수!! sysout으로 출력만 해도 디폴트 함수 
		System.out.println("==========계산기가 작동됩니다==========");  // 객체 생성할 때마다 호출되는 함수
	}
	
	public CalFunc(int a, char b, int c) {  // 객체 새로 생성할 때 마다 입력 받는다. 
		num1 = a;
		op = b;
		num2 = c;
	}
	
	//=================setter, getter 함수====================
	public void setN1(int num) {    
		num1 = num;			
	}
	
	public void setN2(int num) {
		num2 = num;
	}
	
	public void setOp(char operator) {
		op = operator;
	}
	
	public void setAns(char ans) {
		answer = ans;
	}
	
	public int getN1() {
		return num1;
	}
	
	public int getN2() {
		return num2;
	}
	
	public char getOp() {
		return op;
	}
	
	public char getAns() {
		return answer;
	}
	
	//======================연산 함수======================
	public int plu(int num1, int num2) { //더하기 
		int result = num1 + num2 ;
		return result;
	}
	public int min(int num1, int num2) { //빼기 
		int result = num1 - num2 ;
		return result;
	}
	public int mul(int num1, int num2) { //곱하기 
		int result = num1 * num2 ;
		return result;
	}
	public double div(int num1, int num2) { //나누기 
		double result = (double)num1 / num2 ;
		return result;
	}
	
	//=======================출력 함수=======================
	public void result(int num1, int num2, char op) { //결과를 출력하는 함수, 매개변수는 3개를 받아야 한다. 
		double result = 0; // 받는 result 값을 double 형태로 초기화 해줌. 
		
		// 객체 생성이 불필요함. main 영역이 아니기 때문에 같은 줄의 메서드 & 필드는 접근 가능하다. 
		// '객체.메서드'로 안 적어도 된다. 
		
		switch(op) {
		case '+' :
			result = plu(num1, num2); //더하기 연산 함수를 실행시키고, 그 결과 값을 result에 넣어준다. 
			break;
		case '-' :
			result = min(num1, num2);
			break;
		case '*' :
			result = mul(num1, num2);
			break;
		case '/' :
			result = div(num1, num2);
			break;
			
		}
		System.out.println(num1 +""+ op +""+ num2 +"=" + result);
	}
	
}
