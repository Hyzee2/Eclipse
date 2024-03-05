import java.util.Scanner;

public class Cu {
	public static void main(String[] args) {

		Scanner sc;
		sc = new Scanner(System.in);

		System.out.println("첫번째 수를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요: ");
		int num2 = sc.nextInt();

		System.out.println("부호를 입력하세요: ");

		char button = sc.next().charAt(0);

		if (button == '+') {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (button == '-') {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if (button == '*') {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		} else if (button == '/') {
			System.out.println(num1 + "/" + num2 + "=" + (double) (num1 / num2));
		} else {
			System.out.println("잘못된 입력 입니다.");
		}

	}

}
