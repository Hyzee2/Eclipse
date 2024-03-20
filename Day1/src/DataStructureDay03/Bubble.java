package DataStructureDay03;

public class Bubble {

	static int[] data = new int[0];

	static void change(int[] data, int i, int j) { // 앞에 있는 큰 수를 뒤에 있는 작은 수왕 자리를 바꿔주는 메서드 
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;

	}

	static void bubbleSort(int[] data) {
		int cnt = 0; // 바꾼 횟수 카운트
		int innerfor = 0;
		int outerfor = 0;

		for (int i = 0; i < data.length - 1; i++) { // data.length-1을 하는 이유는 i=0번째 돌때 이미 제일 큰 수는 맨 마지막으로 위치하기 때문

			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					change(data, i, j);
					cnt++;
				}

				innerfor++;
			}
			outerfor++;

		}
		System.out.println("자리 변경 횟수는 : " + cnt); // cnt는 비교한 후 실제로 자리 이동이 일어난 횟수
		System.out.println("실제로 비교가 일어난 횟수는 : " + innerfor); // 안쪽 바깥문은 실제로 컴퓨터가 비교를 수행한 횟수
		System.out.println("배열의 총 길이에서 마지막 자리는 제외한 수 : " + outerfor); // 바깥쪽 반복문은 그냥 배열의 길이
	}

	public static void main(String[] args) {
		int data[] = { 90, 78, 100, 30, 55 };

		bubbleSort(data);

		for (int i : data) {
			System.out.print(i + "\t");
		}

	}

}
