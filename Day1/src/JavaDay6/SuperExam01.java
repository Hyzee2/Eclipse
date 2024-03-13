package JavaDay6;

class AA{
	private int a; //10
	
	public AA() {
		
	}
	
	public AA(int a) {
		this.a = a; // AA클래스의 인스턴스 변수 a에다가 값을 할당해줌!
	}
	 
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
}

class BB extends AA{
	private int b; //20
	
	public BB() {
		
	}
	
	public BB(int a, int b) {
		super(a); // a를 받는 AA(super class)의 생성자로 간다 
		this.b = b;
		
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getB() {
		return b;
	}
}

class CC extends BB{
	private int c; //30
	
	public CC() {
		
	}
	
	public CC(int a, int b, int c) {
		super(a, b); // a,b를 받는 BB(super class)의 생성자로 간다 
		this.c = c;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	public int getC() {
		return c;
	}
}

public class SuperExam01 {
	
	public static void main(String[] args) {
		
		CC cc = new CC(10, 20, 30);
		
		
		// cc.a = 10; 바로 접근 불가능
		
		System.out.println(cc.getA());
		System.out.println(cc.getB());
		System.out.println(cc.getC());
		
	}
	
}
