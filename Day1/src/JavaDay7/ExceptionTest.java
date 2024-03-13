package JavaDay7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest extends Exception{ //예외처리 2가지 만들기 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=1;
		String name="";
		String[] arr = new String[num];
		
		try {
			System.out.println("전체 강아지 수를 입력하세요");
			num = sc.nextInt();
			
			System.out.println("리스트에 들어갈 강아지 이름을 입력하세요");
			name = sc.next();
			
			for(int i=0; i<num+1; i++) { //num이 2일때, for문 돌기 전에 이름 입력 / i=0 -> 입력 / i=1 -> 입력 / i=2 -> 입력
				name = sc.next();
				arr[i] = name;
				i++;
			}
			
		}catch(InputMismatchException inputex) { //숫자 이외로 입력했을 때, 예외처리 
			
			System.out.println("숫자로 입력해주세요");
			
		
		}catch(ArrayIndexOutOfBoundsException arrex) { //입력한 배열의 길이(num)보다 더 많이 입력하려고 할 때, 예외처리
			
			System.out.println("배열의 길이를 벗어났습니다.");
			return;
			
		}finally {
			System.out.println("Bye");
		}
		
	}

}
