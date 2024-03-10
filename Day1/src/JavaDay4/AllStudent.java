package JavaDay4;

import java.util.Scanner;

public class AllStudent {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //학생 수와 과목별 점수를 입력받아야 한다. 
		
		System.out.println("학생 수를 입력하세요");
		int num = sc.nextInt();
		
		//배열을 생성해준다. 배열의 데이터 타입은 StudentHasA라는 클래스
		//배열은 객체를 생성할 때 무조건 배열의 길이를 설정해줘야 한다. 앞에서 작성한 num 값으로 배열의 길이가 설정된다.
		StudentHasA []as = new StudentHasA[num]; 
		
		//i=0인 행에 이름과 국, 영, 수 점수, 총합, 평균을 입력받아서 넣어주기.
		//AllStudent라는 클래스가 배열 데이터의 타입이므로 배열의 값의 데이터 타입도 AllStudent 클래스이다. 

		for(int i=0; i<num; i++) {
			System.out.println((i+1)+"번째 학생의 이름과 국어, 수학, 영어 점수를 차례로 입력하세요");
			as[i] = new StudentHasA(); //StudentHasA 클래스로 객체를 생성하여 AllStudent의 i행에 차례로 값을 넣어준다.  
			
			as[i].setName(sc.next());
			as[i].setKor(sc.nextInt());
			as[i].setMat(sc.nextInt());
			as[i].setEng(sc.nextInt());
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(as[i].getName()+ "\t");
			System.out.print(as[i].getKor()+ "\t");
			System.out.print(as[i].getMat()+ "\t");
			System.out.print(as[i].getEng()+ "\t");
			System.out.print(as[i].getTotal()+ "\t");
			System.out.print(as[i].getAvg()+ "\t");
			System.out.println();
		}
	}

}
