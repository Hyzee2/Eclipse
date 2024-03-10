package JavaDay4;

import java.util.Scanner; 

public class ScoreProgram { // 최종 성적관리 프로그램   
	private Menu1 m1;
//	private Menu2 m2;
//	private Menu3 m3;
//	private Menu4 m4;
	
	public ScoreProgram() {
		System.out.println("성적관리 프로그램이 시작됩니다. ");
		m1 = new Menu1();
//		m2 = new Menu2();
//		m3 = new Menu3();
//		m4 = new Menu4();
	}
	
	public static void main(String[] args) {
		
		ScoreProgram sp = new ScoreProgram();
		Scanner sc = new Scanner(System.in);
		char ans; //while문에서도 쓰기 위해 변수 선언  
		
		do {
				System.out.println("어느 메뉴를 선택하시겠습니까? 숫자를 입력해주세요");
				System.out.print("Menu1 : 학생성적입력" +"\t");
				System.out.print("Menu2 : 학생성적수정" +"\t");
				System.out.print("Menu3 : 학생성적검색" +"\t");
				System.out.print("Menu4 : 학생성적출력" +"\t");
		
				int m = sc.nextInt(); //1~4까지 숫자 입력받음  
		
				switch(m) {
				case 1 : 
					sp.m1.main(null); //1번 입력하면 m1의 main 부분 호출됨  
					break;
//				case 2 : 
//					sp.m2.main(null);
//					break;
//				case 3 : 
//					sp.m3.main(null);
//					break;
//				case 4 : 
//					sp.m4.main(null);
//					break;	
				}
				
				System.out.println("계속 진행하시겠습니까? 다른 메뉴를 선택하려면 Y를 입력해주세요.");
				ans = sc.next().charAt(0);
		} while(ans == 'Y' || ans == 'y');
		
	}
	
}

