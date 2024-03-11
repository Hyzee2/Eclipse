package JavaDay4;

import java.util.Scanner; 

public class Menu1 { //학생 성적 입력 버튼 (ScoreInput 클래스의 배열화)  

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		ScoreInput []si = new ScoreInput[100]; //100을 배열의 길이로 설정 
		
		int num=0;
		
		System.out.println("입력할 학생 수는 총 몇 명입니까?");
		num=sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println((i+1)+"번째 학생의 이름과 국어, 영어, 수학 점수를 차례로 입력하세요");
			si[i] = new ScoreInput(); //ScoreInput 클래스로 생성된 객체를 i행 배열에 넣어준다. 
			
			si[i].setName(sc.next()); //ScoreInput의 setName메서드 이용하여 이름 값 입력받음.  
			si[i].setKor(sc.nextInt());
			si[i].setEng(sc.nextInt());
			si[i].setMat(sc.nextInt());
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(si[i].getName()+ "\t");
			System.out.print(si[i].getKor()+ "\t");
			System.out.print(si[i].getEng()+ "\t");
			System.out.print(si[i].getMat()+ "\t");
			System.out.print(si[i].getTotal()+ "\t");
			System.out.print(si[i].getAvg()+ "\t");
			System.out.println();
		}

	}

}
