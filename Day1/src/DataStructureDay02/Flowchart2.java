package DataStructureDay02;

import java.util.Random;

public class Flowchart2 { // 정돈된 수
	int[] input = new int[7];
	int x = 0;
	int y = 0;

	void select() { // 랜덤으로 2개의 수를 뽑아서 작은 수는 x에 큰 수는 y에 넣어주는 메서드
		Random r = new Random();

		int s = r.nextInt(9999999);
		int w = r.nextInt(9999999);

		System.out.println(s + "," + w);

		if (s > w) {
			x = w;
			y = s;
		} else {
			y = w;
			x = s;
		}

	}

	int[] number(int i) { // 연속된 숫자를 배열로 넣어주는 메서드

		System.out.print("받은 숫자를 배열로 넣습니다.");

		int num = i; // num은 i값으로 초기화

		String w = Integer.toString(num); // int를 String으로 변환

		for (int j = 0; j < 7; j++) { // 문자열 한 자리씩 배열에 넣기
			input[j] = Character.getNumericValue(w.charAt(j)); // 다시 char형을 int형으로 변환

		}

		for (int n : input) {
			System.out.print(n); // 출력
		}
		System.out.println("배열로 변환해서 input에 넣었습니다. ");
		return input;

	}

	void result(int x, int y) { // 한자리수끼리 비교하는 메서드 
		int cnt = 0 ; // 정돈된 경우이면 카운트하는 변수 선언
		
		for(int num=x; num<=y; num++) { // num은 x와 y사이의 수
			input = number(num); // num을 배열화해서 input에 넣음 
		 	System.out.println("num을 배열화 했습니다. ");
		 	int len = 3; // 배열의 길이 초기화 
		 	
		 	switch(len) {
		 	case 3: // 3자리 수
		 		for(int j=0; j<len-1; j++) {
		 			if(input[j] < input[j+1]) {
		 				cnt++;
		 			}
		 		}
		 		System.out.println("3자리수 비교 완료");
		 		if(cnt == 2) {
		 			for(int p : input) {
		 				System.out.print(p);
		 			}
		 		}
		 		break;
		 	
		 		
		 	}
		 	
		}
		
		
	}
	
	public static void main(String[] args) {
		Flowchart2 flow = new Flowchart2();
		flow.select();
		flow.number(flow.x);
		flow.number(flow.y);
		flow.result(flow.x, flow.y);

	}

}
