package DataStructureDay04;

import java.util.Scanner;

public class RecursiveCall {
	int mul = 1;
	int num = 0;
	int[] arr = new int[0];

	int[] repeat(int num) { // 입력받은 숫자를 배열로 넣어주는 메서드
		int[] arr = new int[num];

		for (int i = 1; i <= num; i++) {

			arr[i - 1] = i;
		}
		return this.arr = arr;

	}

	void multiple(int num) { // 배열로 넣은 값들을 연속해서 곱해주는 메서드
		// arr[0]*arr[1]*arr[2]* *arr[num-1]
		for (int i = 1; i < num; i++) {
			arr[i] = arr[i - 1] * arr[i];
		}
		System.out.println(arr[num - 1]);
	}

	int factorial(int num) { // 재귀함수
		int mul = 1;

//		while (num != 0) {
//			mul = mul * num;
//			System.out.println(mul);
//			num--;
//
//		}
		
		if(num==1) {
			return 1;
		}
		mul = num * factorial(num-1);
		
		return this.mul = mul;
	}

	public static void main(String[] args) {

		RecursiveCall rc = new RecursiveCall();
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 ");
		rc.num = sc.nextInt();

//		rc.repeat(rc.number);	// 이거는 반복문으로 사용합니다.  
//		rc.multiple(rc.number);	// 이거는 반복문으로 사용합니다.  

		rc.factorial(rc.num); // 이거는 재귀함수로 사용합니다.
		System.out.println(rc.num + "의 팩토리얼 값은 " + rc.mul + "입니다.");
	}

}
