package JavaDay6;

class Halbe{
	public void disp() {
		System.out.println("Halbe");
	}
}

class Abe extends Halbe{
	public void disp() {
		System.out.println("Abe");
	}
	
	public void dispAbe() {
		System.out.println("dispAbe");
	}
}

class Me extends Abe{
	public void disp() {
		System.out.println("Me");
	}
	
	public void dispMe() {
		System.out.println("dispMe");
	}
}


public class Dynamic {

	public static void main(String[] args) {
		Me me = new Me();
		me.disp();
		
		Abe abe = new Abe();
		abe.disp();
		
		Halbe halbe = new Halbe();
		halbe.disp();
		
		halbe = abe; // 동적바인딩
		halbe.disp();
		
		halbe = me;
		halbe.disp();
		
		//halbe.dispMe(); // halbe가 알고있는 부분만 가능
		
		//사용자를 고려해서 정적 바인딩과 동적 바인딩 모두 고려해야한다. 
		

	}

}
