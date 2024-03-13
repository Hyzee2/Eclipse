package JavaDay4;
import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try { //예상되는 예외를 인식
			
			int num = sc.nextInt(); // 문자로 넣어도 에러가 발생하므로...
			System.out.println(3/num); //예외가 발생한 지점
	
		}catch(ArithmeticException ae) { //에러 메시지에 나오는 클래스명을 찾겠다 : 예외처리기
			System.out.println("0은 입력하지 마세요.");
			return; // 메서드 강제 종료 -> main 밖으로 나간다. 
			
		}catch(Exception in) { //다중 catch문 사용 가능(위 catch 문에서부터 순서대로) : 명시적으로 예외 클래스명 대신 부모 클래스 쓰면 모든 예외처리 잡을 수 있다. 
			System.out.println("문자는 입력하지 마세요."); 
		}finally { //return을 만나도 finally 이후는 무조건 실행하게 된다. 
			System.out.println("Bye");
		}
	}

}
