package JavaDay4;

class AA {
	
	int aa;
	
	
	public int getAa() {
		return aa;
	}


	public void setAa(int aa) { //객체를 setter를 통해 주입하는 방법
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
	
	private AA aa; // has-a 관계란 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언한다는 의
	private BB bb;
	private CC cc;
	
	void setAA(AA aa) { //AA클래스의 필드인 aa값을 set하는 함수. 클래스AA에는 int aa를 필드로 갖고 있다. 
		this.aa = aa;  //  외부에서 객체를 만들어서 주입해서 사용
		bb = new BB(); // 내부에서 객체를 직접 만든 것
		cc = new CC();
	}
	
	public static void main(String[] args) {
		HasA2 hasa2 = new HasA2();
		AA a = new AA(); //클래스HasA2는 클래스 AA를 포함하고 있으므로 역시 객체 생성해야 아래 setter함수를 이용하여 필드 aa에 값을 넣어줄 수 있다!
		
		hasa2.setAA(a); // hasa2.aa = a; 필드를 직접 쓰는건 안 좋은 코딩
		
	}
}


