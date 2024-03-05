import java.util.Scanner; //기존에 만들어놓은 Scanner라는 클래스를 이용하기 위해서 import 

public class Operator { //Operator라는 클래스를 생성. 클래스 내에 또 클래스 생성 가능하다.
	public static void main(String []args) {

/*
 * int num;  int라는 데이터 타입을 갖고 있는 num 
 * num = 3;  num은 값을 넣을 수 있는 저장 공간, num이라는 변수 안에 3이라는 상수를 넣음.
 */
		Scanner sc; //클래스 Scanner라는 타입을 갖고 있는 sc 생성. sc라는 객체를 사용할 예정. 
		sc = new Scanner(System.in); //new를 이용하여 
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 + "이 "+ num2 + "보다 큽니다.");
		} 
		else if(num1<num2){
			System.out.println(num2 + "이 "+ num1 + "보다 큽니다.");
		}
		else {
			System.out.println("두 수는 동일합니다");
		}
		
		
	}
}
