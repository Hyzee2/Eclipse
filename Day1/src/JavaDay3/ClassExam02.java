package JavaDay3;

public class ClassExam02 {
	
	private int a; // 필드 초기화 
	
	public ClassExam02() { // 디폴트 생성자 
		System.out.println("디폴트 생성자");
	}
	
	public ClassExam02(int aa) { // 오버로딩
		a = aa;
		System.out.println("오버로딩한 생성자");
	}
	
	public static void main(String[] args) { // main은 외부라고 생각하고 코딩!! 
		
		ClassExam02 ce2 = new ClassExam02(); // 생성자 호출, ce2라는 객체를 생성함
		
		ClassExam02 ce3 = new ClassExam02(10); // 생성자 호출, 초기화 값이 10
		
		ClassExam02 ce4 = new ClassExam02(500); // 생성자 호출, 초기화 값이 500 
		
		ce2.setA(250); // 외부에서도 사용 가능한 문법
		
		System.out.println(ce2.getA()); // 외부에서도 사용 가능
		
//		System.out.println(ce2.a); // 외부에서는 이렇게 작성 불가
//		System.out.println(ce3.a);
//		System.out.println(ce4.a);
		
		
	}

	// method: setter(외부에서 주는 데이터를 입력하는 함수), getter(외부에서 필드값을 얻어가는 함수)
	
	
	public void setA(int num) { // '필드 a의 값을 입력한다'는 의미로 메서드명 작성
		a = num;
	}
	
	public int getA() { // '필드 a의 값을 반환한다'는 의미
		return a;
	}
	
}
