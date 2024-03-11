package SalaryProgram;

public class PayStep { //호봉별 급여 
	private int payStep; //1호봉, 2호봉 
	private int stepSalary; //호봉에 따른 급여 

	public PayStep() { //디폴트생성자 
		
	}
	
	public PayStep(String position, int tenure) { //직급과 근속연수를 입력받는 생성자
		
	}
	
	public void setPayStep(String position, int tenure) { // 매개변수로 position, tenure를 받아서 
		matchStep(position, tenure); //matchStep메서드에서 payStep과 stepSalary를 구해냄 
		//this.payStep = payStep; 할 필요가 없다. 이미 matchStep 메서드에서 필드 payStep으로 바로 값을 할당해줬기 때문 
	}
	
	public int getPayStep() {
		return payStep;
	}
	
	public void setStepSalary(String position, int tenure) {
		matchStep(position, tenure);
	}
	
	public int getStepSalary() {
		return stepSalary;
	}
	
	public void matchStep(String position, int tenure) { // 매개변수 필수로 지정
		switch(position) {
		case "주임" :
			this.stepSalary=0;
			break;
		case "임원" :
			this.stepSalary=0;
			break;
		case "계장" :
			if(tenure <=3) {
				this.payStep=1;
				this.stepSalary=1900000;
			}else if(tenure<=7) {
				this.payStep=2;
				this.stepSalary=2100000;
			}
			break;
		case "대리" :
			if(tenure <=3) {
				this.payStep=1;
				this.stepSalary=2500000;
			}else if(tenure<=7) {
				this.payStep=2;
				this.stepSalary=2700000;
			}
			break;
		case "과장" :
			if(tenure <=3) {
				this.payStep=1;
				this.stepSalary=3100000;
			}else if(tenure<=7) {
				this.payStep=2;
				this.stepSalary=3300000;
			}
			break;
		case "차장" :
			if(tenure <=3) {
				this.payStep=1;
				this.stepSalary=3700000;
			}else if(tenure<=7) {
				this.payStep=2;
				this.stepSalary=3900000;
			}
			break;
		case "부장" :
			if(tenure <=3) {
				this.payStep=1;
				this.stepSalary=4300000;
			}else if(tenure<=7) {
				this.payStep=2;
				this.stepSalary=4500000;
			}
			break;
		}
	}
	
//	public static void main(String[] args) {
//		PayStep ps = new PayStep();
//		
//		System.out.println("이건 payStep 실행 값");
//		ps.setPayStep("대리", 2);
//		System.out.println(ps.getPayStep());
//		
//		System.out.println("이건 stepSalary 실행 값");
//		ps.setStepSalary("과장", 6);
//		System.out.println(ps.getStepSalary());
//	}
	
}
