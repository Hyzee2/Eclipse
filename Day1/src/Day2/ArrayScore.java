package Day2;

import java.util.Scanner;

public class ArrayScore { // N명의 성적 처리 프로그램 만드는 함수

	public static void main(String[] args) { //main은 위에서 밑으로 순서대로!! 함수는 main에서만 끌어다 쓰므로 객체 선언도 main에서만 해주면 된다. 
		
		ArrayScore as = new ArrayScore();
		
		Scanner sc = new Scanner(System.in);
		String n = "name";
		int s = 0;
		int t = 0;
		
		//필요한 변수 선언
		System.out.println("학생 수는 총 몇 명 입니까?");
		int cnt = as.student(sc.nextInt());
		System.out.println(cnt);
		
		String[] name = new String[cnt];
		int[][] score = new int[cnt][4];
		float[] avg = new float[cnt];
		
		as.inputName(cnt, sc, n, name); // 학생 이름을 입력하는 함수
		as.inputScore(sc, cnt, s, score); // 학생별 점수를 입력하는 함수
		as.total(cnt, t, score); // 학생별 점수 총합 입력하는 함수
}
	
	//인원 수 입력 함수
	public int student(int cnt) {
		return cnt;
	}
	
	//이름 입력 함수
	public void inputName(int cnt, Scanner sc, String n, String[] name) {
		
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+"번째 학생 이름을 입력하세요.");
			n = sc.next();
			name[i] = n;
		}
	}
	
	//점수 입력 함수(국, 영, 수)
	public void inputScore(Scanner sc, int cnt, int s, int[][] score) {
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<3; j++) { //i=0 부터 반복문 시작
				System.out.println((i+1)+"번째 학생의 국, 영, 수 점수를 차례로 입력하세요.");
				s = sc.nextInt();
				score[i][j] = s;
			}
		}
	}		
	//총합 연산 함수
	public void total(int cnt, int t, int[][] score) {
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<3; j++) {
				t += score[i][j]; //[0][0], [0][1], [0][2]까지 더하기 
			}
			
			/*
			 * 1. [0][0] 20 , [0][1] 30 , [0][2] 40  -> [0][3] 90
			 * 2. [1][0] 10, [1][1] 20, [1][2] 40 -> [1][3] 70
			 * 3. [2][0] 10, [2][1] 20, [2][2] 20 -> [2][3] 70
			 */
		}
	}
	
	//평균 연산 함수
	public void average(int cnt, float[] avg, int[][] score) {
		for(int i=0; i<cnt; i++) {
			avg[i] = (float)score[i][3] / 3;
		}
	}
	
	//배열로 출력 함수
			
	
	
}
