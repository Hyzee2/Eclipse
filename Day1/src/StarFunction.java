// 별 함수 만들기  
// 홀수 입력값을 받아서, 1~5번 모양의 별이 출력되는 함수 만들기  
import java.util.Scanner;

public class StarFunction {

	public static void main(String[] args) {
		
		StarFunction sf = new StarFunction();
		Scanner sc = new Scanner(System.in);
		// 변수 지정  
		int h=0;
		int s=0;
		
		
		do{
			System.out.println("홀수의 값을 입력하세요.");
			h = sc.nextInt();
		} while(h%2==0); // 짝수의 값을 입력받으면 다시 do 안에 있는 명령문 실행  
		
		System.out.println("1~5번까지 어떤 모양의 별을 그리고 싶은지 선택하세요.");
		s = sc.nextInt();
		
		switch(s) { //switch 문 사용해서 일치하는 별 출력 함수 사용하기.   
		case(1):
			sf.star1(h);
			break;
		case(2):
			sf.star2(h);
			break;
		case(3):
			sf.star3(h);
			break;
		case(4):
			sf.star4(h);
			break;
		case(5):
			sf.star5(h);
			break;
		}
	}
	
	// 홀수의 값만 입력받는 함수
	public int height(int h) {  //Scanner 함수는 main 에다가 사용했으므로 int 값만 받고 반환하는 함수  
		return h;
		
	}
	// 1번 모양으로 출력되는 함수
	public void star1(int h) {
		for(int i=0; i<h; i++) {
			for(int j=0; j<h; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 2번 모양으로 출력되는 함수
	public void star2(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 3번 모양으로 출력되는 함수
	public void star3(int h) {
		for(int i=0; i<h; i++) {
			for(int j=h-1; j>i; j--) { //i=0 -> j=0,1    i=1 -> j=0
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
			
			}
	}
	// 4번 모양으로 출력되는 함수
	public void star4(int h) {
		for(int i=1; i<=h; i++) {
			for(int j=h; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) { //i=1 -> j=1, i=2 -> j=3, i=3 -> j=5)
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 5번 모양으로 출력되는 함수  
	public void star5(int h) { //위쪽 삼각형 그리기  
		for(int i=1; i<=h; i++) {
			for(int j=h; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<h; i++) { //아래쪽 삼각형 그리기  
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<2*h-i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
