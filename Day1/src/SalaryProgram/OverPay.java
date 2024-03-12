package SalaryProgram;

public class OverPay { // 월별 시간외 수당
	
	private int overtime; //시간외 근무(분)
	private int overpay; // 시간외 수당 = 시간외 근무(분) /30(분) * 10,000원
	
	public OverPay(int overtime) {
		
	}
	
	public void setOvertime(int overtime) { //시간외근무 시간을 set
		this.overtime = overtime;
		op(overtime);
	}
	
	public int getOvertime() { //시간외근무 시간 get
		return this.overtime;
	} 
	
	public void op(int overtime) { //시간외근무 수당 연산 함수
		this.overpay = overtime / 30 * 10000; 
	}
	
	public int getOverpay() { // 시간외근무 수당 get
		return this.overpay;
	}
}
