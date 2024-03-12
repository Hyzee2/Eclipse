package JavaDay6;

class Aclass{
	
	public Aclass() {
		//super();     Object의 디폴트 생성자로 가겠다!
		System.out.println("Aclass");
	}
	
}

public class IsAExam01 extends Aclass {
	
	public IsAExam01() {
		// sysout 줄이 실행되기 이전에 부모의 생성자를 호출함
		//super();     부모의 디폴트 생성자에 가겠다! 위치는 자식 생성자의 첫번째 줄에 있다. 
		System.out.println("IsAExam01");
	}
	
	public static void main(String[] args) {
		
		IsAExam01 isa = new IsAExam01();
		
	}

}
