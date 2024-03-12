package SalaryProgram;

public class Position { // 직급
	private String position;
	private int positionPay;
	
	public Position(String position) {
		this.position = position;
		matchPo(position);
	}
	
	public void setPo(String position) {
		this.position = position;
	}
	 
	public String getPo() {
		return position;
	}
	
	public void matchPo(String position) {
		switch(position) {
		case "주임" :
			positionPay = 300000;
		case "계장" :
			positionPay = 500000;
		case "대리" :
			positionPay = 700000;
		case "과장" :
			positionPay = 1000000;
		case "차장" :
			positionPay = 1200000;
		case "부장" :
			positionPay = 1500000;
		case "임원" :
			positionPay = 5000000;
		}
	}
	
	public int getPopay() {
		return positionPay;
	}
}
