package SalaryProgram;

import java.util.Scanner;

public class EmployeeList { //급여관리 프로그램
	private int num =0;
	// 필드 부분 
	private static Employee[] emp = new Employee[100]; //Employee 객체를 100명까지 담을 수 있는 배열로 선언 
	private int index; //Employee 배열에 사용될 index 선언 
	Scanner sc = new Scanner(System.in);
	
	public EmployeeList(){ //생성자 함수 
		//이게돕니다
	}
	
	public EmployeeList(String name, int employeeNum, String hireDateStr, int overtime, String kpi) {
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
		emp[num] = new Employee(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next());
		
//		emp[num].setName(sc.next());
//		emp[num].setEmpnum(sc.nextInt());
//		emp[num].setHire(sc.next());
//		emp[num].setPo(sc.next()); 
//		emp[num].setOvertime(sc.nextInt());
//		emp[num].setKpi(sc.next());
		
		System.out.println("============================================================");
		System.out.print(emp[num].getEmpnum()+"\t");
		System.out.print(emp[num].getName()+"\t");
		System.out.print(emp[num].getTemperate()+"\t");
		System.out.print(emp[num].getPo()+"\t");
		System.out.print(emp[num].getHire()+"\t");
		System.out.print(emp[num].getTenure()+"\t");
		System.out.print(emp[num].getKpi()+"\t");
		
		num++;
		
		//EmployeeList[index] = new Employee(employeeNum, name, position, hireDate, )
	}
	//직원 정보 수정(사번으로 검색 -> 1. 직급 / 2. kpi / 3. 시간외근무 / 4. 수정안함
	public void employEdit() {
		Employee em = new Employee();
		
		System.out.println("사번을 입력해주세요");
		em.setEmpnum(sc.nextInt());
		
		System.out.println("무엇을 수정하시겠습니까? 1. 직급  2. kpi  3. 시간외근무  4. 수정안함");
//		switch(sc.nextInt()) {
//		case 1 : 
//			
//		}
		
	}
	
	//직원 정보 검색(이름, 사번, 입사일자, 근속연수, 직급, 비정규직여부, 시간외근무(분), 급여) : 사번으로 검색
	
	//모든 직원 정보 출력(이름, 사번, 입사일자, 근속연수, 직급, 비정규직여부, 시간외근무(분), 급여) 

	public static void main(String[] args) {

		
		EmployeeList empli = new EmployeeList();
		
		empli.employInput();
		
		
		
		
		
		
		
//		Position po = new Position();
//		Employee a = new Employee();
//		
//		a.setName("김현지");
//		a.setEmpnum(1655431);
//		a.setPo("임원");
//		a.getTemperate();
//		a.setHire("2019-12-26");
//		a.setKpi("양호");
//		a.setOvertime(100);
//		a.setPayStep("대리", 4);
//		a.setStepSalary("대리", 4);
//		
//		System.out.println(a.getName());
//		System.out.println(a.getEmpnum());
//		System.out.println(a.getPo());
//		System.out.println(a.getTemperate());
//		System.out.println(a.getHire());
//		System.out.println(a.tenureYear(a.getHire()));
//		System.out.println(a.getKpiRate());
//		System.out.println(a.getPopay());
//		System.out.println(a.getOverpay());
//		
//		System.out.println(a.getPayStep());
//		System.out.println(a.getStepSalary());

	}
}
