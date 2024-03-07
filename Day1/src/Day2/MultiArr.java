
// 3명의 성적 처리 프로그램

package Day2;

import java.util.Scanner;

public class MultiArr {

	public static void main(String[] args) {
		
		String []name = new String[3]; //이름
		int [][]score = new int [3][4]; //국, 영, 수, 총
		float []avg = new float[3]; //평균
		
		String []scoName = {"Name", "Kor", "Eng", "Mat", "Total", "Avg"};
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		for(int i=0; i<3; i++) {
			System.out.print(scoName[0] + "input:  ");
			name[i] = sc.next();
			for(int j=0; j<3; j++) {
				System.out.println("국,영,수 점수를 차례로 입력하세요.");
				score[i][j] = sc.nextInt();
				score[i][3] += score[i][j];
			}
			avg[i] = (float) score[i][3] / 3; 
		}
		
		//출력
		for(int i=0; i<3; i++) {	
			System.out.print(name[i]+"\t");
		
			for(int j=0; j<4; j++) {
				System.out.print(score[i][j]+"\t");
			}
		
			System.out.println(avg[i]);
			}
		}
	

}
