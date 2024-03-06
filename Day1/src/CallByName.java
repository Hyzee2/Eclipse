
public class CallByName {
	public static void main(String []args) { //static method
		CallByName.disp2();
		
		CallByName cbn = new CallByName();
		cbn.disp1();
		//cbn.disp2(); //static method를 instance method처럼 사용해서 별로 좋지 않은 코드
		
		int num = 100;
		
		num = cbn.disp3(num); //disp3에서 가져온 값을 =식으로 넣어준다. 
		System.out.println(num); //100          //101
		
		
		//String str = new String("Superman"); //call by reference하기 위해 "Superman"값을 가진 String이라는 문자열 객체를 생성함. 
		String str = "Superman";
		
		String m = cbn.disp4(str); //disp4 함수 호출
		
	}
	
	public String disp4(String s) {  //Call by refenence는 s가 str의 주소값(위치)을 넣은 것.
		System.out.println(s);
		return(s);
	}
	
	public void disp1() { //instance method
		System.out.println("Call by name1");
	}
	
	public static void disp2() { //static method
		System.out.println("Call by name2");
	}
	
	public int disp3(int num) { //main에서 선언된 num은 disp3의 num과 다른의미. 즉, main에서의 num이 갖고 있는 100이라는 값 자체를 보내 받은 것.
		System.out.println(num); //100
		num++;
		System.out.println(num); //101
		
		return num; //101의 값을 가지고 disp3으로 간다   >>  Call by value 방식
	} //함수가 끝나면 main의 cbn.disp3(num)으로 호출된다.
}
