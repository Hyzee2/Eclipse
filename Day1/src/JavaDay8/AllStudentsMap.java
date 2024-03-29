package JavaDay8;
import java.util.*;
import java.util.Map.Entry;

import JavaDay4.StudentHasA;

public class AllStudentsMap { // HashMap으로 학생성적관리 
	int button = 1;
	int index=0;
	Scanner sc = new Scanner(System.in);

	HashMap<Integer, StudentHasA> arr = new HashMap<Integer, StudentHasA>(); 

	public AllStudentsMap() {

	}

	public AllStudentsMap(String name, int kor, int eng, int mat) {

	}
	
	public int getButton() {
		return button;
	}

	public int main() {
		System.out.println();
		System.out.println("==============성적 관리 프로그램==============");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 수정");
		System.out.println("3. 학생 성적 검색");
		System.out.println("4. 전체 학생 성적 출력");
		System.out.println("메뉴를 선택해주세요");
		button = sc.nextInt();
		return button;
	}

	public void stuInput() { // 학생 성적 입력
		System.out.println("학생의 이름, 국어, 영어, 수학 점수를 차례로 입력하세요");
		
		//int index=0;
		StudentHasA stu = new StudentHasA();
		
		arr.put(index, stu);
		stu.setName(sc.next());
		stu.setKor(sc.nextInt());
		stu.setEng(sc.nextInt());
		stu.setMat(sc.nextInt());
		
		index++;
	}

	public void stuModify() { // 학생 성적 수정

		System.out.println("누구를 수정하시겠습니까? 이름을 입력해주세요");
		String name = sc.next();
		
		

		for (Map.Entry<Integer, StudentHasA> entry : arr.entrySet()) {
			
			if (entry.getValue().getName().equals(name)) {
				index = entry.getKey(); //입력한 이름의 키 값을 index에 담아준다. 
				StudentHasA value = entry.getValue(); //해당 키의 값(학생이라는 객체)을 value에 담는다. 
				
				System.out.println("무엇을 수정하시겠습니까? 숫자로 골라주세요");
				System.out.print("1. 국어" + "\t" + "2. 영어" + "\t" + "3. 수학" + "\t" + "4. 종료");
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1:
					System.out.println("수정된 점수를 입력해주세요");
					value.setKor(sc.nextInt());
					System.out.println("수정완료!");
					break;
				case 2:
					System.out.println("수정된 점수를 입력해주세요");
					value.setEng(sc.nextInt());
					System.out.println("수정완료!");
					break;
				case 3:
					System.out.println("수정된 점수를 입력해주세요");
					value.setMat(sc.nextInt());
					System.out.println("수정완료!");
					break;
				case 4:
					System.out.println("종료합니다");
					return;
				}
			}
		}
	}

	public void stuSearch() { // 학생 이름으로 검색
		System.out.println("누구를 조회하시겠습니까? 이름을 입력해주세요");
		String name = sc.next();
		
		for(Map.Entry<Integer, StudentHasA> entry : arr.entrySet()) {
			if(entry.getValue().getName().equals(name)) { //entry.getValue()는 객체 stu를 반환하므로 한번더 getName()을 해줘야 한다. 
				index = entry.getKey();
				StudentHasA value = entry.getValue(); 
				System.out.println(value);
				return;
			}
		} System.out.println("존재하지 않는 이름 입니다");
		
		
	}
	
	public void stuPrint() { // 전체 학생 성적 출력
		for(Entry<Integer, StudentHasA> entryset : arr.entrySet()) {
			System.out.println(entryset.getKey()+ "번: "+entryset.getValue());
		}

	}
	

	public static void main(String[] args) {
		AllStudentsMap allstu = new AllStudentsMap();

		do {
			allstu.main();
			switch (allstu.getButton()) {
			case 1:
				allstu.stuInput();
				break;
			case 2:
				allstu.stuModify();
				break;
			case 3:
				allstu.stuSearch();
				break;
			case 4:
				allstu.stuPrint();
				break;
			}
		} while (true);

	}

}
