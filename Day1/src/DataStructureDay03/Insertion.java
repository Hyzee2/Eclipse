package DataStructureDay03;

import java.util.Random;
import java.util.random.*;

public class Insertion {
	
	int temp=0;
	
	void change(int[] arr) { // 자리 값을 비교해서 바꿔주는 메서드 

	}

	void insertionSort(int[] arr) {
		int cnt = 0;
		//int ch = 0;
		int i = 0;
		int j = 0;
		
		for (i = 1; i < arr.length; i++) {
			
			temp = arr[i]; // 우선 비교기준이 되는 값을 temp에 담아두기 
			
			for(j=i-1; j>=0 && arr[j]>temp; j--) { // j는 i의 값보다 1 작은 인덱스 / j는 0이상이어야 하고, 비교기준이 되는 i의 값보다 더 큰 경우 / j의 값은 점점 감소
				arr[j+1] = arr[j]; // j 위치의 값을 오른쪽으로 한 칸 옮긴다.  
			}	
			
			arr[j] = temp; // 최종적으로 비교기준이 되는 i위치의 값을 마지막 j 위치의 값으로 넣어준다. 
			
			cnt++;
			
			//ch++;
		}

		System.out.println("실제로 자리 이동 일어난 횟수는 :" + cnt);
		//System.out.println("실제로 값을 비교한 횟수는 :" + ch);
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
