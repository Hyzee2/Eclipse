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
		int n = 0;
		do {
			System.out.println("높이를 홀수로 입력하세요 ");
			n = sc.nextInt();
		} while (n % 2 == 0);

		for (int i = 1; i <= (n / 2) + 1; i++) {
			for (int j = n / 2; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= n / 2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = n - 2; j >= 2 * i - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}