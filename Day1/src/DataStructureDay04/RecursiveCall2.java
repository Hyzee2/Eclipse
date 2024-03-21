package DataStructureDay04;

import java.util.Scanner;

public class RecursiveCall2 {
	// int[] arr = new int[0];
	int num = 0;

	int Fibonacci(int n) { // 0,1,1,2,3,5,8,13 ...
		int[] arr = new int[n];

		if (n >= 3) {

			arr[n - 1] = Fibonacci(n - 1) + Fibonacci(n - 2);

		} else if (n == 2) {
			arr[1] = 1;
			arr[0] = 0;
		} else if (n == 1) {
			arr[0] = 0;
		}

		return arr[n - 1];
	}

	public static void main(String[] args) { // 피보나치 수열의 n번째 항을 반환하는 함수 구현하기 (n>0)
		Scanner sc = new Scanner(System.in);
		RecursiveCall2 rc2 = new RecursiveCall2();
		System.out.println("0보다 큰 수를 입력해주세요");

		rc2.num = sc.nextInt() + 1;

		System.out.println("피보나치 수열 나열");
		for (int i = 0; i < rc2.num; i++) {
			System.out.print(rc2.Fibonacci(i + 1) + "\t");
		}

		System.out.println();
		System.out.println(rc2.num - 1 + "번째의 숫자는 " + rc2.Fibonacci(rc2.num - 1) + " 입니다.");

	}

}
