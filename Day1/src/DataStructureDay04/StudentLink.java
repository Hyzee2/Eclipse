package DataStructureDay04;

import java.util.Scanner;

import JavaDay4.StudentHasA;
import JavaDay8.AllStudents;

public class StudentLink { // 학생성적관리 Linked List로 만들기

	static NewStudent head; 
	static NewStudent cur; 
	static NewStudent NewStudent; // newNode와 동일
	static NewStudent del;
	int button = 1;
	
	NewStudent stu = new NewStudent();
	Scanner sc = new Scanner(System.in);	
	
	public StudentLink() {

	}

	public StudentLink(String name, int kor, int eng, int mat) {

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
		head = cur = NewStudent = new NewStudent(); 
		NewStudent.next = null;

		if (head == null) { // head가 null이면 
			cur = head; //cur은 head를 가리키고
			head = NewStudent; 
		} else { 
			cur = head; // cur은 head로 초기화
			while(cur.next != null) { //cur의 다음이 null이 아닐때, 
				cur = cur.next; //cur의 next를 cur로 넣는 무한루프 생성
			}
			NewStudent.next = cur.next; // 
			cur.next = NewStudent;
		}
		System.out.println("학생의 이름, 국어, 영어, 수학 점수를 차례로 입력하세요");

		stu.setName(sc.next()); // setter 함수를 통해 Name 값을 담아주기
		stu.setKor(sc.nextInt()); // 국어 점수
		stu.setEng(sc.nextInt()); // 영어 점수
		stu.setMat(sc.nextInt()); // 수학 점수
		
		System.out.println(stu.toString());

	}
	
	public void stuModify() { // 학생 성적 수정 / 이름으로 검색한 후, 
		
		int s = 0; // 수정된 점수 입력값

		System.out.println("누구를 수정하시겠습니까? 이름을 입력해주세요");
		String nameIndex = sc.next();
		
		

		for (int i = 0; i < arr.size(); i++) {

			if (arr.get(i).getName().equals(nameIndex)) { // stu객체 속 이름을 getter해서 입력받은 이름과 동일하다면

				System.out.println("무엇을 수정하시겠습니까? 숫자로 골라주세요");
				System.out.print("1. 국어" + "\t" + "2. 영어" + "\t" + "3. 수학" + "\t" + "4. 종료");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("수정된 점수를 입력해주세요");
					s = sc.nextInt();
					arr.set(i, stu).setKor(s);
					// all[i].setKor(s);
					System.out.println("수정완료!");
					break;
				case 2:
					System.out.println("수정된 점수를 입력해주세요");
					s = sc.nextInt();
					arr.set(i, stu).setEng(s);
					System.out.println("수정완료!");
					break;
				case 3:
					System.out.println("수정된 점수를 입력해주세요");
					s = sc.nextInt();
					arr.set(i, stu).setMat(s);
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
		String nameIndex = sc.next();
		
		cur = head;
		while(cur != null) { 		
			//stu = cur;
			if(stu.getName().equals(nameIndex)) { // 만약 입력한 이름과 동일하면
				System.out.println(stu);
			}
		}
	}
	
	public static void main(String[] args) {
		StudentLink link = new StudentLink();

		do {
			link.main();
			switch (link.button) {
			case 1:
				link.stuInput();
				break;
//			case 2:
//				link.stuModify();
//				break;
			case 3:
				link.stuSearch();
				break;
//			case 4:
//				link.stuPrint();
//				break;
			}
		} while (true);


	}

}
