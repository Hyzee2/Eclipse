package JavaDay7;

public class InnerClassExam01 { //outer class

	private int a;
	private static int b;
	
//	class Test{ //member inner class 
//		
//		public void dispT() {
//			System.out.println(a); //outer class의 변수를 바로 사용 가능하다. 변수를 자기자신의 것처럼 사용!
//			System.out.println(b);
//		}
//	}
//	
//	static class Test2{ //static inner class
//		
//		public void dispT2() {
//			System.out.println(b); //a는 static이 아니기 때문에 에러 
//
//		}
	
	void disp() {
		class Test3{ //local inner class
						
			public void dispT3() {
				System.out.println(a); //disp()의 호출로 접근 가능하다 
				System.out.println(b);
			}	
			
		}
		
		Test3 t3 = new Test3(); //inner.disp() 메서드를 호출했을 때 객체를 생성해야 하므로, local class 밖에도 객체 생성해줘야 함. 
		t3.dispT3();
			
	}

	
	public static void main(String[] args) {
//		InnerClassExam01 inner = new InnerClassExam01();
//		InnerClassExam01.Test t1 = inner.new Test();

//		InnerClassExam01.Test t1 = new InnerClassExam01().new Test(); //동시에 outer와 inner class 객체 생성 
//		
//		t1.disp();
		
		InnerClassExam01 inner = new InnerClassExam01();
		inner.disp();
		
		
	}

}
