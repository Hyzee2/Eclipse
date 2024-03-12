package SalaryProgram;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee {
	
	private String name; //이름 
	private String employeeNum; //사번
	private String hireDate; // 입사일자
	private int overtime=0; // 시간외 근무(분)
	private int temp; // 비정규직이면 1, 정규직이면 0
	private OverPay overpay; //월별시간외수당 
	private Kpi kpi; //성과 지급률
	private Position position; //직급별 급여
	private PayStep paystep; // 호봉별 급여
	private int tenure; //근속연수
	private double salary; // 급여  
	private double taxRate=0.15; //세율은 15%
	private double tax; //세금  
	
	public Employee() {
		
	}
	
	public Employee(String name, String employeeNum, String hireDate, String position, int overtime, String kpi) {  
		
		this.name = name;
		this.employeeNum = employeeNum;
		this.hireDate = hireDate;
		this.overtime = overtime;
		this.kpi = new Kpi(kpi);
    	this.position = new Position(position);
    	tenure = tenureYear(hireDate);
		overpay = new OverPay(overtime);
    	paystep = new PayStep(position, tenure); 
    	
	}
	
	
	//=============이름 입력 함수===============
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}
	
	//==============사번 입력 함수==============
	public void setEmpnum(String m) {
		this.employeeNum = m;
	}
	
	public String getEmpnum() {
		return employeeNum;
	}
	
	//===============입사일자 입력 함수==========
	public void setHire(String hiredate) {
		this.hireDate=hiredate;
	}
	
	public String getHire() {
		return hireDate;
	}
	
	//=============월별 시간외 수당==============
	public void setOvertime(int overtime) {
		this.overpay.setOvertime(overtime);
		op(overtime);
	}
	
	public int getOvertime() {
		return this.overpay.getOvertime();
	}
	
	public void op(int overtime) {
		this.overpay.op(getOvertime());
	}
	
	public int getOverpay() {
		return this.overpay.getOverpay();
	}
	//=================KPI=========================
	public void setKpi(String kpi) { //kpi 값 지정해주기
		this.kpi.setKpi(kpi);
		
	}
	
	public String getKpi() { //kpi 값 반환해주기
		return this.kpi.getKpi();
	}
	
	
	public void setKpiRate(String kpi) { //KpiRate 연산 해주는 함수
		this.kpi.setKpiRate(kpi);
		
	}
	
	public double getKpiRate() {
		return kpi.getKpiRate();
	}
	
	//=============직급별 급여=================
	public void setPo(String position) {
		this.position.setPo(position);
		matchPo(position);
	}
	
	public String getPo() {
		return position.getPo();
	}
	
	public void matchPo(String position) {
		this.position.matchPo(getPo());
	}
	
	public int getPopay() {
		return position.getPopay();
	}
	//==============호봉별 급여================
	public void setPayStep(String position, int tenure) {  //매개변수는 사용자들이 입력할 데이터형으로 지정!
		paystep.matchStep(position, tenure);  //
	}
	
	public int getPayStep() {
		return paystep.getPayStep();
	}
	
	public void setStepSalary(String position, int tenure) {
		paystep.matchStep(position, tenure);
	}
	
	public int getStepSalary() {
		return paystep.getStepSalary();
	}
	
	//=================근속연수(년) 구하기======================
	public int tenureYear(String hireDateStr) {	// 매개변수로 넣어준다. 

        // 직원의 입사일자를 LocalDate로 변환한다.
        LocalDate hireDate = LocalDate.parse(hireDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // 현재 날짜를 구한다.
        LocalDate currentDate = LocalDate.now();

        // 근속 연수를 계산한다.
        Period result = Period.between(hireDate, currentDate);
        
        
        return result.getYears();
    }
	
	public void setTenure(int tenure) {
		Employee em = new Employee();
		this.tenure = em.tenureYear(hireDate);
	}

	public int getTenure() {
		return tenure;
	}
	
	//=================비정규직 여부=======================

	public int getTemperate() {
		String p = position.getPo();
		if(p.equals("주임") || p.equals("임원")) {
			this.temp=1;
		}else {
			this.temp=0;
		}
		return temp;
	}
	
	//====================급여계산=========================
	public void salaryResult() {
		salary = position.getPopay()*(1+kpi.getKpiRate())+paystep.getStepSalary()+overpay.getOverpay();
		tax = salary * taxRate;
		salary = salary - tax;
	}

	public double getTaxRate() {
		return taxRate;
	}
	
	public double getTax() {
		return tax;
	}
	
	public double getSalary() {
		return salary;
	}
}
	




