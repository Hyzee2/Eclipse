package DataStructureDay03;

import java.util.Random;
import java.util.random.*;

public class Insertion {
	int cnt = 0;
	int temp=0;
	
	void change(int[] arr) { // 자리 값을 비교해서 바꿔주는 메서드 
		// 1. i의 값을 선택해준다. i의 값을  temp 변수에 넣어준다. 
		// 2. i의 바로 왼쪽(i-1)에 있는 값과 비교한다. 
		// 3. 왼쪽 값이 더 크면 큰 값을 i에 대입한다. 
		// 4. 계속 비교하다가 왼쪽 값이 더 작으면 그 위치에 temp 변수 값을 넣어준다. 
		// * i의 값은 1부터 arr.length길이만큼
		
		for(int p=1; p<arr.length; p++) {
			temp = arr[p];
			if(arr[p] < arr[p-1]) {
				arr[p] = arr[p-1];
				cnt++;
			}else {
				arr[p] = temp;
			}
		}

	}

	void insertionSort(int[] arr) {
//		int cnt = 0;
		int ch = 0;
		for (int i = 0; i < arr.length; i++) {
			change(arr);
			ch++;
		}

		System.out.println("실제로 자리 이동 일어난 횟수는 :" + cnt);
		System.out.println("실제로 값을 비교한 횟수는 :" + ch);
	}

	public static void main(String[] args) {
		Insertion is = new Insertion();
		int data[] = new int[1000];
		//Random random = new Random();

		for (int i = 0; i < 1000; i++) {
			data[i] = (int) Math.floor(Math.random() * 1000);
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
