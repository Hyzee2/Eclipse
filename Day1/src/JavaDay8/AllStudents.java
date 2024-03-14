package JavaDay8;

import java.util.*;

import JavaDay4.StudentHasA;

public class AllStudents { // 학생 성적 관리 ArrayList로 담기 
	Scanner sc = new Scanner(System.in);
	ArrayList<StudentHasA> arr = new ArrayList<StudentHasA>(); // 필드에 StudentHasA를 ArrayList로 객체 생성 
	
	int button = 1;

	public AllStudents() {
		
	}

	public AllStudents(String name, int kor, int eng, int mat) {
		
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

//	public void studentRow() { // 입력된 학생 정보 출력
//		
//		int i = all.indexOf(student);
//		
//			System.out.print(all.get(i).getName() + "\t");
//			System.out.print(all.get(i).getKor() + "\t");
//			System.out.print(all.get(i).getEng() + "\t");
//			System.out.print(all.get(i).getMat() + "\t");
//			System.out.print(all.get(i).getTotal() + "\t");
//			System.out.print(all.get(i).getAvg());
//			System.out.println();
//		
//		}
	

	public void stuInput() { // 학생 성적 입력
		StudentHasA stu = new StudentHasA(); // 객체 생성 후 
		System.out.println("학생의 이름, 국어, 영어, 수학 점수를 차례로 입력하세요");
		
		stu.setName(sc.next()); //setter 함수를 통해 Name 값을 담아주기
		stu.setKor(sc.nextInt()); //국어 점수
		stu.setEng(sc.nextInt()); //영어 점수
		stu.setMat(sc.nextInt()); //수학 점수 

		arr.add(stu); // ArrayList에는 StudentHasA객체만 담을 수 있으므로 우선 StudentHasA 객체를 생성해줘야 한다. 

		
	}	

	public void stuModify() { // 학생 성적 수정
		StudentHasA stu = new StudentHasA();
		int index;

		System.out.println("누구를 수정하시겠습니까? 이름을 입력해주세요");
		String name = sc.next();

		for (int i = 0; i < arr.size(); i++) {
			
			if(index = arr.indexOf(name)) { //입력한 이름을 찾아서 그 위치를 
				arr.get(index);
				System.out.println("무엇을 수정하시겠습니까? 숫자로 골라주세요");
				System.out.print("1. 국어" + "\t" + "2. 영어" + "\t" + "3. 수학" + "\t" + "4. 종료");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("수정된 점수를 입력해주세요");
					s = sc.nextInt();
					all[i].setKor(s);
					System.out.println("수정완료!");
					break;
				case 2:
					System.out.println("수정된 점수를 입력해주세요");
					s = sc.nextInt();
					all[i].setEng(s);
					System.out.println("수정완료!");
					break;
				case 3:
					System.out.println("수정된 점수를 입력해주세요");
					s = sc.nextInt();
					all[i].setMat(s);
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
		for (int i = 0; i < num; i++) {
			if (all[i].getName().equals(name)) {
				studentRow(i);
			} else {

				System.out.println("존재하지 않는 이름 입니다");
			}
		}
	}

	public void stuPrint() { // 전체 학생 성적 출력
		for(StudentHasA student : all) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		
		AllStudents allstu = new AllStudents();

		allstu.stuInput();
		allstu.studentRow();
		
		
//		do {
//			allstu.main();
//			switch (allstu.getButton()) {
//			case 1:
//				allstu.stuInput();
//				break;
//			case 2:
//				allstu.stuModify();
//				break;
//			case 3:
//				allstu.stuSearch();
//				break;
//			case 4:
//				allstu.stuPrint();
//				break;
//			}
//		} while (true);
//
	}

}


