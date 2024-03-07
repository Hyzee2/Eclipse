/*
 * 구성요소
 * 1. field: 
 * 2. constructor
 * 3. method
 */


package JavaDay3;

public class ClassExam01 {
	
	// 인스턴스는 객체가 생성된 후에야 사용 가능. static은 객체 유무 상관없이 공유하며 사용 가능
	private int A;	// field
	private char B;    // field
	
	public static void main(String[] args) {
		
		// output()는 인스턴스 메서드이기 때문에 객체를 생성해줘야 한다. 
		ClassExam01 ce = new ClassExam01(); // 생성자 호출 함수, 클래스명과 동일하게 써준다. 
		
		ce.output(1, 2);
		ce.output(3.4);
		ce.output(11);
		ce.output();
	}
	
	public void output(int a) {
		System.out.println("a, b");
	}
	
	public void output(int a, int b) {
		System.out.println("a");		
	}
	
	public void output(double a) {
		System.out.println("int a");
	}
	
	public void output() {
		System.out.println("Nothing");
	}

}
