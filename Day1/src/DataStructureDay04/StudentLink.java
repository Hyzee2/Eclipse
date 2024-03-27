package DataStructureDay04;

import java.util.Scanner;

import JavaDay4.StudentHasA;
import JavaDay8.AllStudents;

public class StudentLink { // 학생성적관리 Linked List로 만들기

	NewStudent head; // 맨 처음에 위치한 Node
	NewStudent cur; // 현재 위치
	NewStudent prev; // cur의 이전에 위치
	NewStudent stu; // newNode와 동일
	NewStudent del; // 삭제할 Node
	NewStudent temp; // 수정한 값을 다시 재정렬할 때 임시로 넣어둘 참조변수
	int size = 0;
	int button = 1;

	Scanner sc = new Scanner(System.in);

	public StudentLink() {
		cur = head; // 객체 생성할 때마다 cur 초기화
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
		System.out.println("5. 선택 학생 삭제");
		System.out.println("6. 종료");
		System.out.println("메뉴를 선택해주세요");
		button = sc.nextInt();
		return button;
	}

	public NewStudent stuInput() { // 학생 정보 입력 후, 반환
		stu = new NewStudent();

		System.out.println("학생의 이름, 국어, 영어, 수학 점수를 차례로 입력하세요");

		stu.setName(sc.next());
		stu.setKor(sc.nextInt());
		stu.setEng(sc.nextInt());
		stu.setMat(sc.nextInt());

		System.out.println("입력한 값은 다음과 같습니다" + "\n" + stu.toString()); // 마지막 위치에서 새로 추가한 학생 객체 내용 출력
		size++;
		return stu;
	}

	void stuFiter(NewStudent stu) { // 삽입정렬 (평균점수 내림차순)

		if (head == null) { // 비어있는 리스트일 때
			head = stu;
			cur = head;
		}

		else { // 기존에 리스트가 있을 때
			cur = head;
			prev = null;

			while (cur != null && cur.getAvg() > stu.getAvg()) { // 삽입을 해야하는 위치 찾기
				// while안의 조건문을 만족할 때 반복문 실행하는 것이므로 내림차순하려면 cur > stu로 작성해야 한다!
				// cur가 null이거나 cur.next의 값이 stu의 값보다 작을때 반복문 빠져나온다.
				prev = cur;
				cur = cur.next;
			}

			if (cur == head) { // 새로운 node 값이 제일 클 때
				stu.next = head;
				head = stu;

			} else {
				stu.next = prev.next;
				prev.next = stu;
			}

//			else if (cur.next != null) { // 새로운 node가 중간에 삽입되어야 할때
//				stu.next = prev.next;
//				prev.next = stu;
//
//			} else { // 새로운 node가 가장 작을 때 (cur.next = null 일때)
//				cur.next = stu;
//				stu.next = null;
//			}
		}
	}

	public NewStudent stuModify() { // 학생 성적 수정
		stuSearch(); // 이름으로 검색

		// prev.next = cur;

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
			break;

		}

		temp = cur;

		if (cur == head) { // cur가 첫번째 위치할 때
			temp = head;
			head = head.next;

		} else { // cur가 중간에 위치할 때
			temp = prev.next;
			prev.next = temp.next;
		}

		temp.next = null;

		return temp; // 순서를 재배치해주기 위해 수정된 학생 객체인 temp를 반환해준다.
	}

	public NewStudent stuSearch() { // 학생 이름으로 검색

		System.out.println("학생 이름을 입력해주세요");
		String nameIndex = sc.next();

		cur = head; // 초기화
		prev = null;

		for (int i = 0; cur != null && i < size; i++) {

			if (cur.getName().equals(nameIndex)) {
				System.out.println(cur.toString());
				break;
			}
			prev = cur;
			cur = cur.next;
		}

		if (cur == null) { // for문에서 cur가 끝까지 이동했을 때
			System.out.println("입력하신 이름은 없습니다. ");
		}

		return cur; // 이름을 찾은 노드의 위치 반환

	}

	public NewStudent studelSearch() { // 학생 이름으로 검색

		System.out.println("학생 이름을 입력해주세요");
		String nameIndex = sc.next();

		cur = head; // 초기화
		prev = null;

		for (int i = 0; cur != null && i < size; i++) {

			if (cur.getName().equals(nameIndex)) {
				System.out.println(cur.toString());
				break;
			}
			prev = cur;
			cur = cur.next;
		}

		if (cur == null) { // for문에서 cur가 끝까지 이동했을 때
			System.out.println("입력하신 이름은 없습니다. ");
		}

		return prev; // 이름을 찾은 노드의 전 위치 반환

	}

	public void stuPrint() { // 전체 학생 성적 출력(평균 성적 내림차순)
		System.out.println("평균 성적 순으로 출력합니다");
		cur = head; // 초기화

		if (head != null) {
			while (cur != null) { // 끝까지 커서가 돈다
				System.out.print(cur.toString() + "\n");
				cur = cur.next;
			}
		} else {
			System.out.println("학생이 존재하지 않습니다");
		}
	}

	public void stuDel() { // 이름으로 검색 한 후, 선택 학생 삭제
		NewStudent del = new NewStudent();
		cur = studelSearch(); // cur = prev

		if (cur == null) { // 첫번째 위치를 삭제할 때
			del = head;
			head = head.next;
		}
//		}else if(cur.next.next == null) { // 마지막 위치를 삭제할 때 
//			
//			cur.next = null;
//		}
		else { // 중간 위치를 삭제할 때
			del = cur.next;
			cur.next = del.next;
		}
		del.next = null;
		del = null;
	}

	public static void main(String[] args) {
		StudentLink link = new StudentLink();

		do {
			link.main();
			switch (link.button) {
			case 1:
				link.stuFiter(link.stuInput());
				break;
			case 2:
				link.stuFiter(link.stuModify());
				break;
			case 3:
				link.stuSearch();
				break;
			case 4:
				link.stuPrint();
				break;
			case 5:
				link.stuDel();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다. ");
				return;
			}
		} while (true);

	}

}
