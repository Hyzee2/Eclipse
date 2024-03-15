package JavaDay8;

import java.util.*;

import JavaDay4.StudentHasA;

public class AllStudentsSet {

	int button = 1;
	Scanner sc = new Scanner(System.in);

	HashSet<StudentHasA> arr = new HashSet<StudentHasA>(); // 필드에 StudentHasA를 HashSet로 객체 생성

	public AllStudentsSet() {

	}

	public AllStudentsSet(String name, int kor, int eng, int mat) {

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
		StudentHasA stu = new StudentHasA(); // 객체 생성 후
		System.out.println("학생의 이름, 국어, 영어, 수학 점수를 차례로 입력하세요");

		stu.setName(sc.next()); // setter 함수를 통해 Name 값을 담아주기
		stu.setKor(sc.nextInt()); // 국어 점수
		stu.setEng(sc.nextInt()); // 영어 점수
		stu.setMat(sc.nextInt()); // 수학 점수

		arr.add(stu); // HashSet에는 StudentHasA객체만 담을 수 있으므로 우선 StudentHasA 객체를 생성해줘야 한다.

	}

	public void stuModify() { // 학생 성적 수정

		System.out.println("누구를 수정하시겠습니까? 이름을 입력해주세요");
		String nameIndex = sc.next(); // 이름을 입력받음

		for (Iterator<StudentHasA> it = arr.iterator(); it.hasNext();) { // 현재 set구조의 요소들을 순서대로 처리하기 위해 Iterator 객체로 반환함
			StudentHasA a = it.next(); //next 함수 더이상 중복 호출 안되도록 여기서 변수 지정!
			
			if (a.getName().equals(nameIndex)) { // 입력받은 이름과 동일한 이름이 있는 객체 stu가 발견된다면
			
				System.out.println("무엇을 수정하시겠습니까? 숫자로 골라주세요");
				System.out.print("1. 국어" + "\t" + "2. 영어" + "\t" + "3. 수학" + "\t" + "4. 종료");
				int choice = sc.nextInt();
			
				switch (choice) {
				case 1:
					System.out.println("수정된 점수를 입력해주세요");
					a.setKor(sc.nextInt()); // a는 stu라는 객체이므로 여기서 setter 함수로 국어점수를 입력해준다.
					System.out.println("수정완료!");
					return;
				case 2:
					System.out.println("수정된 점수를 입력해주세요");
					a.setEng(sc.nextInt());
					System.out.println("수정완료!");
					return;
				case 3:
					System.out.println("수정된 점수를 입력해주세요");
					a.setMat(sc.nextInt());
					System.out.println("수정완료!");
					return;
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

		for (Iterator<StudentHasA> it = arr.iterator(); it.hasNext();) {
			StudentHasA a= it.next(); // it.next()를 사용할 때는 한번만 호출해야 된다. 다음 반복문에서도 it.next()를 사용하게 되면 오류 발생. 따라서 변수로 지정해주자. 
			
			if (a.getName().equals(nameIndex)) {
				System.out.println(a);
				return;
			}
		}
		System.out.println("존재하지 않는 이름 입니다"); // if문의 반대가 아닌 for문의 반대상황이어야 출력되는 위치!! 
	}

	public void stuPrint() { // 전체 학생 성적 출력
		for (StudentHasA stu : arr) {
			System.out.println(stu);
		}
	}

	public static void main(String[] args) {

		AllStudentsSet allstu = new AllStudentsSet();

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
