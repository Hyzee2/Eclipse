package JavaDay7;

public class InterExam implements CCC {

	public static void main(String[] args) {
		//InterExam inter = new InterExam();
		CCC inter = new InterExam(); // 동적바인딩. CCC도 AAA와 BBB를 상속받아서 메서드 사용 가능하다. 
		
		inter.disp();
		inter.disp2();
		
		//inter.dip3(); // 에러 CCC는 disp3을 모르기 때문. 
	}
	public void disp3() {
		System.out.println("Disp3");
	}
	
	@Override
	public void disp(){ // AAA와 BBB가 공통된 추상 메서드를 가지고 있기 때문에 한 번만 오버라이딩 해주면 된다. 
		System.out.println("Disp");
	}
	
	@Override
	public void disp2(){
		System.out.println("Disp2");
	}
}
