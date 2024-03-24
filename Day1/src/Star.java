
import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("높이를 홀수로 입력하세요 ");
			n = sc.nextInt();

		} while (n % 2 == 0);
		for (int i = 1; i <= (n / 2) + 1; i++) {
			int j = 1;
			if (j >= 1 && j <= n / 2 + 1) {
				for (j = n / 2 + 1; j >= i; j--) {
					System.out.print("*");
				}
				for (j = 1; j + 1 <= i; j++) {
					System.out.print(" ");
				}
			}
//			else if (j >= n / 2 + 2 && j <= n) {
//				for (j = n / 2 + 2; j < i - (n / 2 + 2) ; j++) {
//					System.out.print(" ");
//				}
//				for (j = n / 2 + 2; j + i <= (n / 2) * 2 + 1; j++) {
//					System.out.print("*");
//				}
//			}

			System.out.println();

		}
	}
}
