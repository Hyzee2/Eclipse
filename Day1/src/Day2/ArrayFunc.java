package Day2;

import java.util.Scanner;

public class ArrayFunc {

	public static void main(String[] args) { //메서드 실행 값들을 표출해내는 내용을 작성, main 함수는 순서대로 실행된다.
		
		ArrayFunc arrf = new ArrayFunc();
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		int count = 0; //학생 수 변수를 선언 
		
		String []name = new String[count]; //이름
		int [][]score = new int [count][4]; //국, 영, 수, 총
		float []avg = new float[count]; //평균
		
		System.out.println("총 인원 수를 입력하세요. ");
		count = arrf.student(sc);
		
		System.out.println("이름을 입력하세요.");
		arrf.name(sc); // 이름 입력함수
		
		System.out.println("국,영,수 점수를 차례로 입력하세요.");
		arrf.score(sc); // 점수 입력함수
		
		System.out.println("학생들의 성적표 입니다. ");
		arrf.result(name, score); //성적표 출력함수
		
	}
	public int student(Scanner sc) { //학생 수를 입력받는 함수.
		int count = sc.nextInt();
		return count;
	}
	public void name(Scanner sc) { //이름을 입력받는 함수
		int count = 0;
		
		for(int i=0; i<count; i++) {
			String name[] = null;
			name[i] = sc.next();	
		}
	}
	public int score(Scanner sc) { //수를 입력받는 함수. CallbyReference로 sc 객체
		int num = sc.nextInt();
		for(int j=0; j<3; j++) {
			score[i][j] = sc.nextInt();
			score[i][3] += score[i][j];
		}
		return score;
	}
}
