package DataStructureDay04;

import java.util.Scanner;

import JavaDay4.StudentHasA;
import JavaDay8.AllStudents;

public class StudentLink { // 학생성적관리 Linked List로 만들기

	NewStudent head; // 맨 처음에 위치한 Node
	NewStudent tail; // 맨 마지막에 위치한 Node
	NewStudent cur; // 현재 위치
	NewStudent NewStudent; // newNode와 동일

	int button = 1;

	NewStudent stu = new NewStudent();
	Scanner sc = new Scanner(System.in);

	public StudentLink() {
		head = cur = tail = new NewStudent();
//		NewStudent.next = null;
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

	public NewStudent stuInput() { // 학생 성적 입력
		NewStudent = new NewStudent();
		NewStudent.next = null;

		if (head == null) { // 비어있는 list인지 확인하는 과정
			head = NewStudent;
			tail = NewStudent;
		} else {
			cur = head; // cur은 head로 초기화
			while (cur.next != null) { // cur의 다음이 null이 아닐때,
				cur = cur.next; // cur의 next를 cur로 넣는 무한루프 생성. cur이 마지막 위치이면 반복문 빠져나온다.
			}
			cur.next = NewStudent;
			//cur = NewStudent;
			tail = NewStudent;

		}
		System.out.println("학생의 이름, 국어, 영어, 수학 점수를 차례로 입력하세요");

		NewStudent.setName(sc.next()); // setter 함수를 통해 Name 값을 담아주기
		NewStudent.setKor(sc.nextInt()); // 국어 점수
		NewStudent.setEng(sc.nextInt()); // 영어 점수
		NewStudent.setMat(sc.nextInt()); // 수학 점수

		System.out.println(NewStudent.toString()); // 마지막 위치에서 새로 추가한 학생 객체 내용 출력
		return head;
	}

	public void stuModify() { // 학생 성적 수정
		stuSearch(); // 이름으로 검색
		int s = 0; // 수정할 점수
		System.out.println("무엇을 수정하시겠습니까? 숫자로 골라주세요");
		System.out.print("1. 국어" + "\t" + "2. 영어" + "\t" + "3. 수학" + "\t" + "4. 종료");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("수정된 점수를 입력해주세요");
			s = sc.nextInt();
			cur.setKor(s);
			System.out.println("수정완료!");
			break;
		case 2:
			System.out.println("수정된 점수를 입력해주세요");
			s = sc.nextInt();
			cur.setEng(s);
			System.out.println("수정완료!");
			break;
		case 3:
			System.out.println("수정된 점수를 입력해주세요");
			s = sc.nextInt();
			cur.setMat(s);
			System.out.println("수정완료!");
			break;
		case 4:
			System.out.println("종료합니다");
			return;

		}
	}

	public NewStudent stuSearch() { // 학생 이름으로 검색

		System.out.println("누구를 조회하시겠습니까? 이름을 입력해주세요");
		String nameIndex = sc.next();

		cur = head; // 초기화
		while (cur.next != null) { // cur를 head에서부터 tail까지 옮겨가는 반복문
			cur = cur.next;
			if (cur.getName().equals(nameIndex)) {

				break;
			}
		}
		return cur;

	}

	public void stuPrint() { // 전체 학생 성적 출력

		cur = head; // 초기화
		while (cur.next != null) {
			cur = cur.next;
			System.out.println(cur.toString());
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
			case 2:
				link.stuModify();
				System.out.println(link.cur.toString());
				break;
			case 3:
				link.stuSearch();
				System.out.println(link.cur.toString());
				break;
			case 4:
				link.stuPrint();
				break;
			}
		} while (true);

	}

}
