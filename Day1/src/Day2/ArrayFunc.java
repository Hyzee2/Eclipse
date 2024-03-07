//package Day2;
//
//import java.util.Scanner;
//
//public class ArrayFunc {
//
//	public static void main(String[] args) { //메서드 실행 값들을 표출해내는 내용을 작성, main 함수는 순서대로 실행된다.
//		
//		ArrayFunc arrf = new ArrayFunc();
//		
//		Scanner sc;
//		sc = new Scanner(System.in);
//		
//		int count = 0; //학생 수 변수를 선언 
//		
//		String[] name = new String[count]; //이름
//		int[][] score = new int[count][4]; //국, 영, 수, 총
//		float[] avg = new float[count]; //평균
//		
//		System.out.println("총 인원 수를 입력하세요. ");
//		count = arrf.student(sc);
//		
//		System.out.println("이름을 입력하세요.");
//		arrf.name(sc); // 이름 입력함수
//		
//		System.out.println("국,영,수 점수를 차례로 입력하세요.");
//		arrf.score(sc); // 점수 입력함수
//		
//		System.out.println("학생들의 성적표 입니다. ");
//		arrf.result(name, score); //성적표 출력함수
//		
//	}
//	public int student(Scanner sc) { //학생 수를 입력받는 함수.
//		int count = sc.nextInt();
//		return count;
//	}
//	public void name(Scanner sc) { //이름을 입력받는 함수
//		int count = 0;
//		
//		for(int i=0; i<count; i++) {
//			String name[] = null;
//			name[i] = sc.next();	
//		}
//	}
//	public int score(Scanner sc) { //수를 입력받는 함수. CallbyReference로 sc 객체
//		int num = sc.nextInt();
//		for(int j=0; j<3; j++) {
//			score[i][j] = sc.nextInt();
//			score[i][3] += score[i][j];
//		}
//		return score;
//	}
//}

// N명의 성적 처리 프로그램

package Day2;

import java.util.Scanner;

public class ArrayFunc {
	//field======================================================================== 
	private String[] name; //이름
	private int[][] score; //점수
	private float[] avg; //평균
	private int total; //총합
	private int count; //학생 수 
	
	//생성자 함수 호출=================================================================
	public ArrayFunc() {
		System.out.println("입력할 학생 수는 몇 명 입니까?");
	}
	
	public ArrayFunc(int n) {
		count = n;
	}
	
	//main 부분======================================================================
	public static void main(String[] args) {
		
		ArrayFunc af = new ArrayFunc(); // 객체 생성
		
		Scanner sc = new Scanner(System.in); 
		
		// ArrayFunc 클래스 내에 name, score, avg 객체 생성
		//String[] name = new String[count]; // 이름 >> 배열(행) 초기값 N
		//int[][] score = new int[count][4]; // 국, 영, 수, 총 >> 배열길이(열) 초기값 4
		//float[] avg = new float[count]; // 평균 >> 배열(행) 초기값 N

		String[] scoName = { "Name", "Kor", "Eng", "Mat", "Total", "Avg" };

		

		// 입력
		for (int i = 0; i < 3; i++) {
			System.out.print(scoName[0] + "input:  ");
			// name[i] = sc.next();
			nameInput(scoName, name, sc, i);
			for (int j = 0; j < 3; j++) {
				System.out.println("국,영,수 점수를 차례로 입력하세요.");
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j];
			}
			avg[i] = (float) score[i][3] / 3;
		}

		// 출력
		for (int i = 0; i < 3; i++) {
			System.out.print(name[i] + "\t");

			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j] + "\t");
			}

			System.out.println(avg[i]);
		}
	}
	
	//setter, getter 함수============================================== 
	public void setName(int index, String n) { //이름을 입력하는 함수
		for(index=0; index<count; index++) {
			name[index] = n;
		} 
	}
	
	public String[] getName() { //이름을 반환하는 함수 
		return name;
	}
	
	public void setScore(int index, int s) { //점수를 입력하는 함수
		for(index=0; index<count; index++) {
			int jndex=0;
			for(jndex=0; jndex<3; jndex++) {
				score[index][jndex] = s;
			}
		}
	}
	
	public int[][] getScore(){ //점수를 반환하는 함수
		return score;
	}
	
	
	
	
	private static void nameInput(String[] scoName, String[] name, Scanner sc, int i) {
		System.out.print(scoName[0] + "input:  ");
		name[i] = sc.next();
	}

}
