package SalaryProgram;

public class Kpi { // 성과 
	
	private String kpi;
	private double kpiRate;	 
	
	public Kpi() { //생성자 함수: KpiRate 값을 셋팅해주는 함수 자동 호출되도록!

	}
	
	public Kpi(String kpi) { //생성자 함수: KpiRate 값을 셋팅해주는 함수 자동 호출되도록!
		this.kpi = kpi;
	}
	
	public void setKpi(String kpi) { //kpi 값 지정해주기
		this.kpi = kpi;
	}
	 
	public String getKpi() { //kpi 값 반환해주기
		return this.kpi;
	}
	
	public void setKpiRate(String kpi) { //KpiRate 연산 해주는 함수
		switch(kpi) {
		case "탁월" :
			kpiRate = 2;
			break;
		case "우수" :
			kpiRate = 1.5;
			break;
		case "양호" :
			kpiRate = 1;
			break;
		case "보통" :
			kpiRate = 0.5;
			break;
		case "미흡" :
			kpiRate = 0.25;
			break;
		}
	}
	
	public double getKpiRate() {
		return kpiRate;
	}
	
}

