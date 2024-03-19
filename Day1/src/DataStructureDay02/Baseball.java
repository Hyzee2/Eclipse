package DataStructureDay02;

import java.util.Scanner;

public class Baseball {
	int[] com = new int[3];
	int[] att = new int[3];
	int strikeCount = 0;
	int ballCount = 0;
	int repeatCount = 0;
	int total;

	int getRepeatCount() {
		return repeatCount;
	}

	public void computer() {

		for (int i = 0; i < 3; i++) {
			com[i] = (int) Math.floor(Math.random() * 9);

			for (int j = 0; j < i; j++) {
				if (i == 0) {

				} else if (com[i] == com[j]) {
					i--;
				}
			}
		}
		repeatCount = 0;

	}

	public void result() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (com[i] == att[j]) {
					if (i == j) {
						strikeCount += 1;

					} else {
						ballCount += 1;

					}
				}
			}
		}
		System.out.println("스트라이크 횟수는 " + strikeCount + "입니다");
		System.out.println("볼 횟수는 " + ballCount + "입니다");

	}

	void getTotal() {
		total += repeatCount;
	}

	public int[] input() {
		strikeCount = 0;
		ballCount = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("서로다른 숫자로 3자리 수를 하나씩 입력해주세요");
		for (int i = 0; i < 3; i++) {
			att[i] = sc.nextInt();
		}
		repeatCount++;
		return att;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Baseball bb = new Baseball();

		System.out.println("게임을 몇번 진행 하시겠습니까?");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			bb.computer();
			//System.out.print(bb.com[0]+" "+bb.com[1]+" "+bb.com[2]); // 컴퓨터의 랜덤 수 표출
			System.out.println();

			do {

				bb.input();
				bb.result();

				System.out.println("정답까지 시도한 횟수는 " + bb.getRepeatCount() + "입니다");

			} while (bb.strikeCount < 3);
			
			System.out.println();
			System.out.println("게임 끝!");
			System.out.println();
			System.out.println("총게임 진행 횟수는" + bb.getRepeatCount() + "입니다");
			bb.getTotal();
			System.out.println("평균 시도 횟수는 " + (float) bb.total / (i + 1) + "입니다");

		}

	}

}
