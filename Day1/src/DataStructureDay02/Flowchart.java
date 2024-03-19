package DataStructureDay02;

import java.util.Arrays;

public class Flowchart {

	int[] input = new int[4]; // 배열의 길이가 4인 input 배열 생성
	int temp = 0; // 자리를 바꾸기 위해 임시로 담아두는 공간, 초기화 0 필수

	void number(int i) { // 숫자를 배열로 넣어주는 메서드

//		System.out.print("받은 숫자를 배열로 넣습니다.");

		int num = i; // num은 i로 초기화
		String w = Integer.toString(num); // int를 String으로 변환

		for (int j = 0; j < 4; j++) { // 문자열 한 자리씩 배열에 넣기
			input[j] = Character.getNumericValue(w.charAt(j)); // 다시 char형을 int형으로 변환

		}

		for (int n : input) {
			System.out.print(n); // 출력
		}

	}

	void random() { // 총 4자리 수의 정수 랜덤 생성하기
		System.out.println("여기는 random 시작");
		for (int i = 0; i < 4; i++) {
			if (i == 0) { // 첫번째 자리 수는 1~9까지 랜덤 생성
				input[i] = (int) Math.floor((Math.random() * 9) + 1);
				System.out.println("여기까지 첫번째 자리 수 생성");
			} else { // 그 이외 자리 수는 0~9까지 랜덤 생성
				input[i] = (int) Math.floor((Math.random() * 9));
				System.out.println("여기까지 나머지 자리 수 생성");
			}
		}
	}

	int[] change() { // 자릿 수 비교하기

		// Arrays.sort(input); // 길이가 정해져있는 배열이면 오름차순으로 자동 정렬해주는 함수

//		for (int i = 0; i < 3; i++) {
//			if (input[i] >= input[i + 1]) {
//				temp = input[i];
//				input[i] = input[i + 1];
//				input[i + 1] = temp;
//				System.out.println("지금 첫번째 반복문 돕니다. ");
//			}
//		}
//
//		for (int i = 0; i < 2; i++) {
//			if (input[i] >= input[i + 1]) {
//				temp = input[i];
//				input[i] = input[i + 1];
//				input[i + 1] = temp;
//				System.out.println("지금 두번째 반복문 돕니다. ");
//			}
//		}
//
//		for (int i = 0; i < 1; i++) {
//			if (input[i] >= input[i + 1]) {
//				temp = input[i];
//				input[i] = input[i + 1];
//				input[i + 1] = temp;
//				System.out.println("지금 세번째 반복문 돕니다. ");
//			}
//		}

		// 앞 부터 천천히 작은수로 만드는 for
		for (int i = 0; i < input.length - 1; i++) {

			// 비교 대상이 작은지 큰지를 확인하기 위한 index에 필요한 for
			for (int j = i + 1; j < input.length; j++) {

				// 현재 비교대상보다 두번째for문의 index위치의 숫자가 작을 때, 서로 위치 변경
				if (input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}

		}

//		if(input[0]>=input[1]) { // [0] >= [1] 이면 
//			temp = input[0]; // [0]을 temp에 담기
//			input[0] = input[1]; //[1]을 [0]에 담기
//			input[1] = temp; // temp을 [1]에 담기  // 최종: [0] <-> [1]
//			System.out.println("지금 첫번째 두번째 비교");
//		}
//		if(input[1]>=input[2]) { //[1]이랑 [2]비교
//			temp = input[1];
//			input[1] = input[2];
//			input[2] = temp;
//			System.out.println("지금 두번째 세번째 비교");
//		}
//		if(input[2]>=input[3]) { //[2]이랑 [3]비교
//			temp = input[2];
//			input[2] = input[3];
//			input[3] = temp;
//			System.out.println("지금 세번째 네번째 비교");
//		}
//		if(input[1]>=input[2]) { //[1]이랑 [2]비교
//			temp = input[1];
//			input[1] = input[2];
//			input[2] = temp;
//			System.out.println("지금 두번째 세번째 비교");
//		}
//		if(input[0]>=input[1]) { //[0]이랑 [1]비교
//			temp = input[0];
//			input[0] = input[1];
//			input[1] = temp;
//			System.out.println("지금 첫번째 두번째 비교");
//		}
		return input;

	}

	void zeroChange() { // 첫번째 자리가 0인 경우 바꿔주기
		int count = 0;
		for (int n : input) {
			if (n == 0) {
				count++;
			}
		}
//		System.out.println("지금 0이 몇개인지 찾았습니다");
//		System.out.println(count);
		switch (count) {
		case 1:
//			System.out.println("0이" + count + "개 일때 실행");
			temp = input[1];
			input[1] = 0;
			input[0] = temp;
			break;
		case 2:
//			System.out.println("0이" + count + "개 일때 실행");
			temp = input[2];
			input[1] = 0;
			input[2] = 0;
			input[0] = temp;
			break;
		case 3:
//			System.out.println("0이" + count + "개 일때 실행");
			temp = input[3];
			input[1] = 0;
			input[2] = 0;
			input[3] = 0;
			input[0] = temp;
			break;
		}
	}

	public static void main(String[] args) {

		Flowchart fc = new Flowchart();

		for (int i = 1000; i < 10000; i++) { // 1000부터 9999까지 숫자 생성
			fc.number(i);
			System.out.print("\t");
			fc.change();
			
			fc.zeroChange();
			for (int s : fc.input) {
				System.out.print(s);
			}
			System.out.println();
		}

	}

}
