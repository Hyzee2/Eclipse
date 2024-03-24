package DataStructureDay03;

import java.util.Random;
import java.util.random.*;

public class Insertion {

	int temp = 0;

	void insertionSort(int[] arr) { // 오름차순으로 삽입정렬
		int cnt = 0; // 삽입된 횟수 카운트
		int ch = 0; // 비교 횟수 카운트
		int i = 1;
		int j = 0;

		for (i = 1; i < arr.length; i++) { // 왼쪽은 정렬이 되어있다 생각하고 2번째 값부터 비교 시작
			if (arr[i] < arr[i - 1]) { // 조건문: 왼쪽과 비교했을 때 왼쪽값이 큰 경우에만 아래쪽 for문 작동, 그렇지 않으면 다음 i로 넘어가서 불필요한 반복 횟수 줄이기 
				temp = arr[i]; // 우선 비교기준이 되는 값을 temp에 담아두기
				for (j = i - 1; j >= 0 && arr[j] > temp; j--) { // j는 i의 왼쪽부터 비교 / j는 0이상이어야 하고, 비교기준이 되는 i의 값보다 더 큰 경우
																// / j의 값은 점점 감소
					arr[j + 1] = arr[j]; // j 위치의 값을 오른쪽으로 한 칸 옮긴다.
					ch++;
				}
				arr[j + 1] = temp; // 최종적으로 비교기준이 되는 i위치의 값을 마지막 j+1 위치의 값으로 넣어준다. 앞의 반복문에서 j가 -1로 되어있기 때문에
				cnt++;
			} else {
				// 왼쪽이랑 비교했을 때 바르게 정렬되어있으면, 다음 i로 넘어감.  
			}
		}
		System.out.println("실제로 삽입정렬된 횟수는 :" + cnt);
		System.out.println("실제로 비교된 횟수는 :" + ch);
	}

	public static void main(String[] args) {
		Insertion is = new Insertion();
		int data[] = new int[10];
		// Random random = new Random();

		for (int i = 0; i < 10; i++) {
			data[i] = (int) Math.floor(Math.random() * 10);
		}

		is.insertionSort(data);

		for (int i = 0; i < 9; i++) {

			if (data[i] > data[i + 1]) {

				System.out.println("Error");
			}
			System.out.println(data[i]);
		}

	}

}
