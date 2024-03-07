package Day2;

public class ThisCall {

	int a;

	int b;
	
	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}

//===========생성자 함수 3가지 작성==================
	public ThisCall() {
		this(0,0); //this()를 쓰면 마지막 생성자 함수를 호출해서 사용
	}
	
	public ThisCall(int a) {
		//this.a = a;
		this(a,0);
	}
	
	public ThisCall(int a, int b) {
		this.a = a;
		this.b = b;
	}	
//===============================================
	
	
	public static void main(String[] args) {
		ThisCall th = new ThisCall(); // 0, 0
		ThisCall th2 = new ThisCall(10); // 10,0
		ThisCall th3 = new ThisCall(20, 30); // 20,30
		
		System.out.println(th.getA()+","+th.getB());
		System.out.println(th2.getA()+","+th2.getB());
		System.out.println(th3.getA()+","+th3.getB());
	}
	
	

}
