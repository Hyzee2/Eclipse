package JavaDay7;

public class InterExam02 {
	
	private int a;
	
	public void dispInter() {
		new AAA() { //AAA는 인터페이스이므로 바로 객체 생성 불가능. anonymous class를 만들어서 추상 메서드를 구체화 시킨다. 
			
			@Override
			public void disp() {
				System.out.println(a); //inner class 이므로 outer class 객체 자유롭게 사용 가능
			}
			
		}.disp();; //객체의 reference명을 지정 안하고 바로 메서드 호출. 일회성으로 사용하기 위해  
	}
	
	public static void main(String[] args) {
		InterExam02 inter = new InterExam02();
		inter.dispInter();

	}

}

/*
 * 객체 생성 후
 * inner.메서드명()을 하는 이유는 inner 객체 안에 있는 메서드를 접근하기 위해서이다. 
 * 그래서 inner.메서드명1()  /  inner.메서드명2() .... 사용할 수 있다. 
 * 그런데 anonymous inner class는 객체의 명칭(inner)을 설정하지 않고, new AAA(){}.메서드명();; 으로 사용한다. 
 * 그러면 inner.메서드명()으로 호출할 수가 없고 AAA클래스의 내용을 또 새로 거쳐야하기 때문에 일회성 event용 class를 만들때 사용한다.
 * 
 * inner.메서드명()으로 호출하면 그 값은 변수에 입력된다. 
*/