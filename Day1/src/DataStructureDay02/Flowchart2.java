package DataStructureDay02;

import java.util.Random;

public class Flowchart2 { // 정돈된 수
	int[] input = new int[0]; // 배열의 길이가 0인 input 배열 선언 
	int x = 0;
	int y = 0;
	int totalCount = 0; // 출력되는 정돈된 수의 총합을 구하기 위한 변수 선언  
	
	int getX() {
		return this.x;
	}
	
	int getY() {
		return this.y;
	}
	
	int getTotalcount() {
		return this.totalCount;
	}

	void select() { // 랜덤으로 2개의 수를 뽑아서 작은 수는 x에 큰 수는 y에 넣어주는 메서드
		Random r = new Random();

		int s = r.nextInt(9999999);
		int w = r.nextInt(9999999);

		if (s > w) {
			x = w;
			y = s;
		} else {
			y = w;
			x = s;
		}

	}

	int[] number(int i) { // 연속된 숫자를 배열로 넣어주는 메서드

//		System.out.print("받은 숫자를 배열로 넣습니다.");

		int n = i; // num은 i값으로 초기화

		String w = Integer.toString(n); // int를 String으로 변환

		int[] input = new int[w.length()]; // String 길이만큼 배열 생성

		for (int j = 0; j < w.length(); j++) { // 문자열 한 자리씩 배열에 넣기
			input[j] = Character.getNumericValue(w.charAt(j)); // 다시 char형을 int형으로 변환

		}

//		for (int a : input) {
//			System.out.print(a); // 출력
//		}
		// System.out.println("배열로 변환해서 input에 넣었습니다. ");
		return this.input = input;

	}

	void result(int x, int y) { // 한자리수끼리 비교하는 메서드

		for (int num = x; num <= y; num++) { // num은 x와 y사이의 수

			number(num); // num을 배열화해서 input에 넣음
//
//			System.out.println("num을 배열화 했습니다. ");
//			
//			
//			for (int s : input) {
//				System.out.print(s);
//			}

			int len = input.length; // 배열의 길이
			int cnt = 0; // 정돈된 순서면 카운트하는 변수 선언

			for (int i = 0; i < len - 1; i++) {
				if (input[i] < input[i + 1]) {
					cnt++;
				}
			}

			int finalCnt = cnt; // 최종 cnt를 변수에 넣어준다. 
			
//			System.out.println();
//			System.out.println(finalCnt);

		 	switch(len) { // 자릿수에 따라서 finalCnt가 달라지므로 switch문을 사용  
		 	case 3: // 3자리 수
		 		if(finalCnt == 2) { // 3자리수에서 정돈된 수는 cnt 값이 2이다. 
		 			for(int p : input) { // cnt 값이 2인 input 배열들 출력 
		 				System.out.print(p); 
		 				
		 			}
		 			System.out.println();
		 			totalCount += 1;
		 		}
		 		break;
		 	case 4:
		 		if(finalCnt == 3) { // 4자리수에서 정돈된 수는 cnt 값이 3이다. 
		 			for(int p : input) { // cnt 값이 3인 input 배열들 출력 
		 				System.out.print(p); 
		 				
		 			}
		 			System.out.println();
		 			totalCount += 1;
		 		}
		 		break;
		 	case 5:
		 		if(finalCnt == 4) { // 5자리수에서 정돈된 수는 cnt 값이 4이다. 
		 			for(int p : input) { // cnt 값이 4인 input 배열들 출력 
		 				System.out.print(p); 
		 				
		 			}
		 			System.out.println();
		 			totalCount += 1;
		 		}
		 		break;
		 	case 6:
		 		if(finalCnt == 5) { // 6자리수에서 정돈된 수는 cnt 값이 5이다. 
		 			for(int p : input) { // cnt 값이 5인 input 배열들 출력 
		 				System.out.print(p); 
		 				
		 			}
		 			System.out.println();
		 			totalCount += 1;
		 		}
		 		break;
		 	case 7:
		 		if(finalCnt == 6) { // 7자리수에서 정돈된 수는 cnt 값이 6이다. 
		 			for(int p : input) { // cnt 값이 6인 input 배열들 출력 
		 				System.out.print(p); 
		 				
		 			}
		 			System.out.println();
		 			totalCount += 1;
		 		}
		 		break;
		 	}

		}

	}

	void main() {
		//Flowchart2 flow = new Flowchart2();
		select();
		System.out.println("Input 1st Number:" + getX());
		System.out.println("Input 2nd Number:" + getY());
		System.out.println();
		number(getX());
		number(getY());
		result(getX(), getY());
		System.out.println("Count : "+ getTotalcount());

	}

}
