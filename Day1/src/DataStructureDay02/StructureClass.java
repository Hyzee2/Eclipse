package DataStructureDay02;

import java.util.Scanner;

public class StructureClass {
	int select = 0;
	Baseball baseball;
	Flowchart flowchart;
	Flowchart2 flowchart2;
	Babygin babygin;

	void disp() {
		System.out.println("=======================");
		System.out.println("어떤 게임을 고르시겠습니까? ");
		System.out.println("1. 숫자야구");
		System.out.println("2. 작은 수 변경");
		System.out.println("3. 정돈된 수");
		System.out.println("4. Baby-gin");
		System.out.println("5. 종료");
		System.out.println("=======================");
	}

	public static void main(String[] args) {
		StructureClass structure = new StructureClass();
		Baseball baseball = new Baseball();
		Flowchart flowchart = new Flowchart();
		Flowchart2 flowchart2 = new Flowchart2();
		Babygin babygin = new Babygin();

		Scanner sc = new Scanner(System.in);
		
		do { // do~while을 사용해서 무한 루프  
			structure.disp();
			structure.select = sc.nextInt();
			
			switch (structure.select) {
			case 1:
				baseball.main();
				break;
			case 2:
				flowchart.main();
				break;
			case 3:
				flowchart2.main();
				break;
			case 4:
				babygin.main();
				break;
			case 5:
				System.out.println("게임을 종료합니다. ");
				return;

			}
		} while (true);
	}

}
