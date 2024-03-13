package SalaryProgram;

import java.util.Scanner;

public class EmployeeList { //급여관리 프로그램
	
	private int num =0;
	private static Employee[] emp = new Employee[100]; //Employee 객체를 100명까지 담을 수 있는 배열로 선언 
	private int index; //Employee 배열에 사용될 index 선언 
	
	Scanner sc = new Scanner(System.in);
	
	public EmployeeList(){ //생성자 함수 
		
	}
	
	public EmployeeList(String name, String employeeNum, String hireDateStr, int overtime, String kpi) {
		// {이름, 사번, 입사일자, 직급, 시간외근무(분), kpi}을 입력받는 생성자 호출

	}
	
	public int getIndex() {
		return index;
	}
	
	
	public int getNum() {
		return num;
	}
	

	//직원 정보 입력(이름, 사번, 입사일자, 직급, 시간외근무(분), kpi)
	public void employInput() {
		System.out.println("직원의 이름, 사번, 입사일자, 직급, 시간외근무(분), kpi 순서대로 입력해주세요. ");
		emp[num] = new Employee(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next());
		//emp라는 배열에 num 인덱스로 사번 입력해줌 
		
		employRow(num);
		
		num++; // 입력 후 인덱스 1씩 증가  
		
		}
	
	//직원 입력 정보 확인  
	public void employRow(int num) {
		System.out.println("============================================================");
		System.out.print(emp[num].getEmpnum()+"\t");  
		System.out.print(emp[num].getName()+"\t");
		System.out.print(emp[num].getTemperate()+"\t");
		System.out.print(emp[num].getPo()+"\t");
		System.out.print(emp[num].getHire()+"\t");
		System.out.print(emp[num].getTenure()+"\t");
		System.out.print(emp[num].getKpi()+"\t");
		System.out.println();
	}
	
	//직원 급여 정보 확인(사번, 기본급, 호봉급, 성과급, 시간외수당, 세율, 세후)
	public void salaryRow(int num) {
		emp[num].salaryResult(); // 급여 계산식
		System.out.println("============================================================");
		System.out.print(emp[num].getEmpnum()+"\t");
		System.out.print(emp[num].getPopay()+"\t");
		System.out.print(emp[num].getPayStep()+"\t");
		System.out.print(emp[num].getKpiRate()+"\t");
		System.out.print(emp[num].getOverpay()+"\t");
		System.out.print(emp[num].getTaxRate()+"\t");
		System.out.print(emp[num].getSalary()+"\t");
		System.out.println();

	}
	
	//직원 정보 수정(사번으로 검색 -> 1. 직급 / 2. kpi / 3. 시간외근무 / 4. 수정안함
	public void employUpdate() {
		int choice=0; // 수정할 항목 변수 선언  
		String employeeNum="";
		
		System.out.println("수정할 사번을 입력해주세요");
		employeeNum = sc.next();
		
		for(int i=0; i<num; i++) {
			if(emp[i].getEmpnum().equals(employeeNum)) {
				while(choice != 4) {
					System.out.println("무엇을 수정하시겠습니까? 1. 직급  2. kpi  3. 시간외근무  4. 수정안함");
					choice = sc.nextInt();
					switch(choice) {
					case 1 : 
						System.out.println("수정할 직급을 입력해주세요");
						emp[i].setPo(sc.next());
						System.out.println("완료");
						System.out.println("수정 후 :" + emp[i].getPo());
						return; //case가 종료되면 다시 choice가 4번이 나올 때까지 반복  
					case 2 :
						System.out.println("수정할 kpi를 입력해주세요");
						emp[i].setKpi(sc.next());
						System.out.println("완료");
						System.out.println("수정 후 :" + emp[i].getKpi());
						return;
					case 3 :
						System.out.println("수정할 시간외 근무를 입력해주세요");
						emp[i].setOvertime(sc.nextInt());
						System.out.println("완료");
						System.out.println("수정 후 :" + emp[i].getOvertime());
						return;
					case 4 :
						break; // 4번이 되면 종료  
					}
					if(choice == 4) {
						break;
					}
				}
			}else {
				continue;
			}
		}
		
	}

	//직원 정보 검색 : 사번으로 검색
	
	public void employSearch() {
		System.out.println("사번을 입력해주세요.");
		String employeeNum = sc.next();
		
		System.out.println("어떤 내용을 조회하시겠습니까? ");
		System.out.println("1. 직원 인사 정보    2. 직원 급여 정보");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			for(int i=0; i<num; i++) {
				if(emp[i].getEmpnum().equals(employeeNum)) {
					employRow(i);
				}else {
					continue;
					}
				System.out.println();
			}
			

		}else {
			for(int i=0; i<num; i++) {
				if(emp[i].getEmpnum().equals(employeeNum)) {
					salaryRow(i);
				}else {
					continue;
					}
				System.out.println();
			}
			System.out.println();

		}
		
	}
	
	
	//모든 직원 정보 출력(이름, 사번, 입사일자, 근속연수, 직급, 비정규직여부, 시간외근무(분), 급여) 	
	public void allPrint() {
		for(int i=0; i<num; i++) {
			employRow(i);
		}
		System.out.println();

	}
	
	
	public static void main(String[] args) {


		EmployeeList emplist = new EmployeeList();
		int selectNum = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("========================직원 급여 관리 프로그램=========================");
			System.out.println("1. 직원 정보 입력");
			System.out.println("2. 직원 정보 수정");
			System.out.println("3. 직원 정보 검색");
			System.out.println("4. 전체 직원 정보 출력");
			System.out.println("5. 종료");
			
			selectNum = sc.nextInt();
			switch(selectNum) {
			case 1 :
				emplist.employInput(); // 입력 메서드 
				break;
			case 2 :
				emplist.employUpdate(); // 수정 메서드  
				break;
			case 3 :
				emplist.employSearch(); // 검색 메서드  
				break;
			case 4 :
				emplist.allPrint(); // 출력 메서드 
				break;
			case 5 :
				System.out.println("프로그램을 종료합니다");
				break;
				
			}
		}while(selectNum != 5);
		
		

	}
}
