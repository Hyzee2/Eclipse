package SalaryProgram;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employee {
	
	private String name; //이름 
	private int employeeNum; //사번
	private String hireDateStr; // 입사일자
	private int temp; // 비정규직이면 1, 정규직이면 0
	private OverPay overpay; //월별시간외수당 
	private Kpi kpi; //성과 지급률
	private Position position; //직급별 급여
	private PayStep paystep; // 호봉별 급여
	private int tenure; //근속연수
	
	public Employee() { //생성자함수에 객체 생성 
		
		Scanner sc = new Scanner(System.in);
		
		overpay = new OverPay();
		kpi = new Kpi();
    	position = new Position();
    	paystep = new PayStep(); 
    	
	}
	//=============이름 입력 함수===============
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}
	
	//==============사번 입력 함수==============
	public void setEmpnum(int m) {
		this.employeeNum = m;
	}
	
	public int getEmpnum() {
		return employeeNum;
	}
	
	//===============입사일자 입력 함수==========
	public void setHire(String h) {
		this.hireDateStr=h;
	}
	
	public String getHire() {
		return hireDateStr;
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
		paystep.matchStep(getPo(), tenure);  //실제 내부적으로 코드가 작동되는 문법으로 작성!
	}
	
	public int getPayStep() {
		return paystep.getPayStep();
	}
	
	public void setStepSalary(String position, int tenure) {
		paystep.matchStep(getPo(), tenure);
	}
	
	public int getStepSalary() {
		return paystep.getStepSalary();
	}
	
//	public static void main(String[] args) {
//		PayStep ps = new PayStep(); 
//		System.out.println("이건 paystep의 실행값");
//		ps.setPayStep("대리", 4);
//		System.out.println(ps.getPayStep());
//		System.out.println("이건 stepsalary의 실행값");
//		ps.setStepSalary("대리", 4);
//		System.out.println(ps.getStepSalary());
//	}
	
	//=================근속연수(년) 구하기======================
	public int tenureYear(String hireDateStr) {	// 매개변수로 넣어준다. 

      	// 직원의 입사일자를 문자열로 나타낸다.
        //String hireDateStr = "";
        // 직원의 입사일자를 LocalDate로 변환한다.
        LocalDate hireDate = LocalDate.parse(hireDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // 현재 날짜를 구한다.
        LocalDate currentDate = LocalDate.now();

        // 근속 연수를 계산한다.
        Period result = Period.between(hireDate, currentDate);
        
        
        return result.getYears();
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

}
//    public static void main(String[] args) {
//        //배열로 객체 생성?
//    	Employee emp = new Employee();
//    	
//    	//OverPay sample
//    	overpay.setOvertime(200);
//    	int s = overpay.getOvertime();
//    	System.out.println(s);
//    	overpay.overpay(s);
//    	int ss = overpay.getOverpay();
//    	System.out.println(ss);
//    	
//    	//Kpi sample
//    	kpi.setKpi("양호");
//    	String k = kpi.getKpi();
//    	System.out.println(k);
//    	kpi.match(k);
//    	double kk = kpi.getKpiRate();
//    	System.out.println(kk);
//    	
//    	//Position sample
//    	po.setPo("대리");
//    	String p = po.getPo();
//    	System.out.println(p);
//    	po.match(p);
//    	int pp = po.getPopay();
//    	System.out.println(pp);
//    	
//    	//PayStep sample
//    	ps.match("대리", 2);
//    	int w = ps.getPayStep();
//    	System.out.println(w);
//    	int ww = ps.getStepSalary();
//    	System.out.println(ww);
    	
    	
   
    	
   
//}




