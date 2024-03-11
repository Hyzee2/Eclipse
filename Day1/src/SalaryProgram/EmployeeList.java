package SalaryProgram;

import java.util.Scanner;

public class EmployeeList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Position po = new Position();
		
		Employee a = new Employee();
		
		a.setName("김현지");
		a.setEmpnum(1655431);
		a.setPo("임원");
		a.getTemperate();
		a.setHire("2019-12-26");
		a.setKpi("양호");
		a.setOvertime(100);
		
		System.out.println(a.getName());
		System.out.println(a.getEmpnum());
		System.out.println(a.getPo());
		System.out.println(a.getTemperate());
		System.out.println(a.getHire());
		System.out.println(a.tenureYear(a.getHire()));
		System.out.println(a.getKpiRate());
		System.out.println(a.getPopay());
		System.out.println(a.getOverpay());
		
		System.out.println(a.getPayStep());
		System.out.println(a.getStepSalary());

//		System.out.println("입력할 직원 수를 입력하세요.");
//		int num = sc.nextInt();
//		Employee []emp = new Employee[num]; 
//		
//		
//		System.out.println("직원의 이름과 사번, 직급, 고용형태, 입사일자, KPI, 시간외 근무시간을 순서대로 입력하세요. ");
//		emp[i] = new Employee();
//		
//		emp[i].setName(sc.next());
//		emp[i].setEmpnum(sc.nextInt());
//		emp[i].setPo(sc.next());
//		emp[i].getTemperate();
//		emp[i].setHire(sc.next());
//		emp[i].setKpi(sc.next());
//		emp[i].setOvertime(sc.nextInt());
//		
//		System.out.print(emp[i].getName()+ "\t");
//		System.out.print(emp[i].getEmpnum()+ "\t");
//		System.out.print(emp[i].getPo()+ "\t");
//		System.out.print(emp[i].getTemperate()+ "\t");
//		System.out.print(emp[i].getHire()+ "\t");
//		System.out.print(emp[i].getKpi()+ "\t");
//		System.out.print(emp[i].getOvertime()+ "\t");
//		System.out.println();

	}
}
