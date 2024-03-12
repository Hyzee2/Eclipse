package SalaryProgram;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1;
		Employee[] emp = new Employee[100];
		EmployeeList emplist = new EmployeeList();
		Scanner sc = new Scanner(System.in);
		System.out.println("사번을 입력해주세요.");
		String employeeNum = sc.next();
		
		System.out.println(emp[num].getEmpnum().equals(employeeNum));
	}

}
