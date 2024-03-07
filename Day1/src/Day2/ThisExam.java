package Day2;

public class ThisExam {
	
	int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) { //setter, getter 함수 쓸 때 매개변수는 보통 필드의 변수와 동일하게 써준다. 
		this.a = a;  // this를 반드시 사용해줘야 하는 조건: 이때 구분해주기 위해 field에 있는 a를 의미하는 this를 붙여준다. 
	}

	public ThisExam getObject() {
		return this;
	}
	
	
	public static void main(String[] args) {
		
		ThisExam th = new ThisExam();
		th.setA(100);
		
		ThisExam th2 = th.getObject();
		
		ThisExam th3 = new ThisExam();
		
		System.out.println(th);
		System.out.println(th2);
		System.out.println(th3);
		
	}

}
