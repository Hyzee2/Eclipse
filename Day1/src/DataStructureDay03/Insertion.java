package DataStructureDay03;

import java.util.Random;
import java.util.random.*;

public class Insertion {

	int temp = 0;

	void insertionSort(int[] arr) {
		int cnt = 0;
		int i = 0;
		int j = 0;

		for (i = 1; i < arr.length; i++) {
			temp = arr[i]; // 우선 비교기준이 되는 값을 temp에 담아두기
			j = i - 1;
			while (j >= 0 && temp < arr[j]) { // 와... 조건식 순서도 중요하구나...
				cnt++; // 실제 자리바꾸는 횟수
				arr[j + 1] = arr[j]; // arr[i]가 아닌 arr[j+1]로 해야지 j의 값이 바로 오른쪽으로 이동
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println("실제로 자리 이동 일어난 횟수는 :" + cnt);
	}

	public static void main(String[] args) {

		Insertion is = new Insertion();
		int data[] = new int[1000];
		Random random = new Random();

		for (int i = 0; i < 1000; i++) {

			data[i] = random.nextInt(1000);
		}

		is.insertionSort(data);

		for (int i = 0; i < 999; i++) {
			if (data[i] > data[i + 1]) {
				System.out.println("Error");
			}
			System.out.println(data[i]);
		}

	}

}
