import java.util.Scanner;

public class Ca {
	public static void main(String []args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		System.out.println("부호를 입력하세요: ");
	
		String button = sc.next();
		
		// switch는 값을 비교하는 것, if는 조건문이므로 
		if(button.equals("+")) {
			System.out.println(num1 + "+" + num2 + "="+ (num1+num2));
		}
		else if(button.equals("-")){
			System.out.println(num1 + "-" + num2 + "="+ (num1-num2));
		}
		else if(button.equals("*")){
			System.out.println(num1 + "*" + num2 + "="+ (num1*num2));
		}
		else if(button.equals("/")){
			System.out.println(num1 + "/" + num2 + "="+ (double)(num1/num2));
		}
		else {
			System.out.println("잘못된 입력 입니다.");
		}
		
		
	}
}
