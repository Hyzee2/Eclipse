/*
 * is~a 관계: 상속관계
 * extends : 상속을 표현
 * 
 */

package JavaDay6;

class A{
	
	public String toString() { // 오버라이딩: 부모의 메서드를 가공하고 싶을 때 사용 
		return super.toString() + "Superman"; // <- 여기에서 super는 Object
	}
	
	public void disp() {
		System.out.println("aaaaaaaa");
	}
	
}

public class IsA extends A { // Object를 상속받는다. (디폴트로 생략되어 있는 부분)
 
	public String toString() { // 오버라이딩: 부모의 메서드를 가공하고 싶을 때 사용 
        return super.toString() + "Superman"; // <- 여기에서 super는 A
    }
	
	public static void main(String[] args) {
		
		IsA isa = new IsA(); // 객체를 만드는 순간 생성자 함수로 호출된다. 
		
		System.out.println(isa); // reference변수이기 때문에 hash code 주소값이 나온다.
		System.out.println(isa.toString()); // object를 상속받았기 때문에 toString메서드(변수명 출력)를 사용할 수 있다. 
											// Object > A > IsA 로 상속관계 형성됨
		isa.disp();

	}

}
