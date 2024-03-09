package JavaDay4;

class AA {
	
	int aa;
	
	
	public int getAa() {
		return aa;
	}


	public void setAa(int aa) {
		this.aa = aa;
	}
}

class BB {
	
	int bb;
	
	
	public int getBb() {
		return bb;
	}


	public void setBb(int bb) {
		this.bb = bb;
	}
}

class CC {
	
	int cc;
	
	
	public int getCc() {
		return cc;
	}


	public void setCc(int cc) {
		this.cc = cc;
	}
}


class HasA2{ 
	
	private AA aa;
	private BB bb;
	private CC cc;
	
	void setAA(AA aa) {
		this.aa = aa;  //  외부에서 객체를 만들어서 주입해서 사용
		bb = new BB(); // 내부에서 객체를 직접 만든 것
		cc = new CC();
	}
	
	public static void main(String[] args) {
		HasA2 hasa2 = new HasA2();
		AA a = new AA();
		
		hasa2.setAA(a); // hasa2.aa = a; 필드를 직접 쓰는건 안 좋은 코딩
		
		//DI(Dependency Indection) 객체주의
	}
}


