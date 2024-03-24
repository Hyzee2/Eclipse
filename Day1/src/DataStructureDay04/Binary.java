package DataStructureDay04;

import java.util.Scanner;

public class Binary {
	int[] arr = { 1, 3, 4, 6, 9, 14, 16, 30, 31, 38 };
	int index = 0;

	int binaryChoice(int[] arr, int value, int low, int high) {
		int mid = (low + high) / 2;
		if (low <= high) {
			if (arr[mid] < value) {
				
				return binaryChoice(arr, value, mid + 1, high);
			} else if (arr[mid] > value) {
				
				return binaryChoice(arr, value, low, mid - 1);
			} else if(arr[mid] == value) {
				
				return index = mid;
			}
		} else
			
			index = -1;
			return index;
	}

	public static void main(String[] args) {

		Binary bi = new Binary();
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		do {
			System.out.println("찾을 값을 입력해주세요.");
			int n = sc.nextInt();
			bi.binaryChoice(bi.arr, n, 0, bi.arr.length - 1);
			if (bi.index >= 0 && bi.index < bi.arr.length) {
				System.out.println(bi.arr[bi.index] + "은 " + (bi.index + 1) + "번째 위치하고 있습니다.");
			} else
				System.out.println("입력한 값은 없습니다. ");
			System.out.println("계속 하시겠습니까? ");
			System.out.println("1. 진행   2. 종료 ");
			answer = sc.nextInt();
		} while (answer == 1);
		System.out.println("프로그램을 종료합니다. ");
	}
}
