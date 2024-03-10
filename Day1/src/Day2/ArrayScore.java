package Day2;

import java.util.Scanner;

public class ArrayScore { // N명의 성적 처리 프로그램 만드는 함수

	public static void main(String[] args) { //main은 위에서 밑으로 순서대로!! 
		
		ArrayScore as = new ArrayScore(); //함수는 main에서만 끌어다 쓰므로 객체 선언도 main에서만 해주면 된다. 
		
		Scanner sc = new Scanner(System.in); //입력을 받을 것이므로 Scanner 사용 
		
		//필요한 변수 선언
		String n = "name";
		int s = 0;
		
		
		System.out.println("학생 수는 총 몇 명 입니까?");
		int cnt = as.student(sc.nextInt()); //입력받는 Scanner는 함수에 직접 사용하기보다 main에서 사용하는 것이 베스
		System.out.println(cnt);
		
		//cnt가 정해졌으므로 배열이 길이를 이제 정할 수 있음!
		String[] name = new String[cnt];
		int[][] score = new int[cnt][4]; //총점까지 int[]로 넣을 수 있으니깐 길이를 4로 설정 
		float[] avg = new float[cnt];
		
		//함수를 이용해서 배열의 형태로 내용을 채워주는 과정 
		as.inputName(cnt, sc, n, name); // 학생 이름을 입력하는 함수
		as.inputScore(sc, cnt, s, score); // 학생별 점수를 입력하는 함수
		as.total(cnt, score); // 학생별 점수 총합 입력하는 함수
		as.average(cnt, avg, score); //학생별 점수 평균 입력하는 함수
		
		System.out.println("전체 학생들의 성적표 입니다.");
		as.print(name, score, avg, cnt); //학생 성적표 출력하는 함수  
		
}
	
	//인원 수 입력 함수
	public int student(int cnt) {
		return cnt;
	}
	
	//이름 입력 함수
	public void inputName(int cnt, Scanner sc, String n, String[] name) {
		
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+"번째 학생 이름을 입력하세요.");
			n = sc.next(); //이름 함수에서 Scanner 사용하는 이유는 이름 입력은 어느 사용자나 직접 입력을 받을 것이기 때문!
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
	public void total(int cnt, int[][] score) {
		for(int i=0; i<cnt; i++) {   
			int sum=0;
			for(int j=0; j<3; j++) {   
				sum=score[i][j];
				sum+=sum;
			}
			score[i][3] = sum; //구한 합계를 [i][3]자리에 각각 저장해주기  
		}
	}
	
	//평균 연산 함수
	public void average(int cnt, float[] avg, int[][] score) {
		for(int i=0; i<cnt; i++) {
			avg[i] = (float)score[i][3] / 3;
		}
	}
	
	//배열로 출력 함수 -> 이것도 for문을 사용해서 출력해보기!, for-each문으로는 불가!
	public void print(String[] name, int[][] score, float[] avg, int cnt) {
			for(int i=0; i<cnt; i++) {
				System.out.print(name[i]+"\t");
				for(int j=0; j<4; j++) {
					System.out.print(score[i][j]+"\t");
				}
				System.out.print(avg[i]);
				System.out.println();
			}
		
	}		
	
	
}
