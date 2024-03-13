package JavaDay4;

import java.util.Scanner;

public class AllStudent { // StudentHasA 클래스를 배열로 입력받을 것

	int num = 0;
	int button = 1;
	String stuName = "";
	StudentHasA stu;

	static StudentHasA[] all = new StudentHasA[100]; // 100명의 학생을 입력 받을 수 있는 크기의 배열 생성

	Scanner sc = new Scanner(System.in);

	public AllStudent() {

	}

	public AllStudent(String name, int kor, int eng, int mat) {

	}

	public int getNum() {
		return num;
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

	public void studentRow(int i) { // 입력된 학생 정보 출력

		System.out.print(all[i].getName() + "\t");
		System.out.print(all[i].getKor() + "\t");
		System.out.print(all[i].getEng() + "\t");
		System.out.print(all[i].getMat() + "\t");
		System.out.print(all[i].getTotal() + "\t");
		System.out.print(all[i].getAvg() + "\t");
		System.out.println();
	}

	public void stuInput() { // 학생 성적 입력
		System.out.println("학생의 이름, 국어, 영어, 수학 점수를 차례로 입력하세요");

		all[num] = new StudentHasA();

		all[num].setName(sc.next());
		all[num].setKor(sc.nextInt());
		all[num].setEng(sc.nextInt());
		all[num].setMat(sc.nextInt());

		num++;
//		all[num] = new StudentHasA(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()); // StudentHasA 클래스에 입력값을 받는
//																							// 생성자가 존재해야 한다!!
//		studentRow(num);
//		num++;

	}

	public void stuModify() { // 학생 성적 수정

		int s = 0;

		System.out.println("누구를 수정하시겠습니까? 이름을 입력해주세요");
		String name = sc.next();

		for (int i = 0; i < num; i++) {
			if (all[i].getName().equals(name)) {
				studentRow(i);
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
		for (int i = 0; i < num; i++) {
			System.out.print(all[i].getName() + "\t");
			System.out.print(all[i].getKor() + "\t");
			System.out.print(all[i].getEng() + "\t");
			System.out.print(all[i].getMat() + "\t");
			System.out.print(all[i].getTotal() + "\t");
			System.out.print(all[i].getAvg() + "\t");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		AllStudent allstu = new AllStudent();

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
