package JavaDay7;

public interface CCC extends AAA, BBB { //인터페이스의 다중상속, AAA와 BBB가 갖고 있는 상수와 추상메서드 모두 사용 가능
	
	default void disp4() { // 기본값인 디폴트생성자 default를 명시해줘야한다. 
		
	}
}
