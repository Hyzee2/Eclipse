/* 5번 별문제 (6,7번 문제 동시 적용) 
 * 
 *   *
 *  ***
 * *****
 *  ***
 *   *  
 */
  
import java.util.Scanner;

public class Star5 {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		//홀수 높이만 입력받는 조건문 
		int h = 0;
		
		do {
			System.out.println("삼각형의 높이를 홀수로 입력하세요.");
			h = sc.nextInt();
		} while(h % 2 == 0); //while 조건식이 true 면 반복 
		
		
		//위쪽 삼각형을 그리는 출력문 
		for(int i=0; i<h; i++) {
			for(int j=0; j<h-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println(); // 한 줄의 반복문 완성 후 줄바꿈  
		}
		
		
		//아래쪽 삼각형을 그리는 출력문
		for(int i=h-2; i>=0; i--) {
			for(int j=0; j<h-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
}
