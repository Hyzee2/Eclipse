package JavaDay7;

public class InnerExam03 {
	
	class InstanceInner{
		int iv=100;
//		static int cv=100; //static inner class만 static 변수 선언 가능
		final static int CONST = 100; //final static은 상수이므로 선언 가능
	}
	
	static class StaticInner{
		int iv=200;
		static int cv=200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv=300;
			final static int CONST = 300;
		}
		
		LocalInner li = new LocalInner();
		System.out.println(li.iv);
	}
	
	public static void main(String[] args) {
		
		InnerExam03.InstanceInner inst = new InnerExam03().new InstanceInner();
		System.out.println(inst.iv);
		
		//InnerExam03.StaticInner stat = new InnerExam03().new StaticInner(); //static은 객체 생성할 필요없으므로 바로 사용 가능
		System.out.println(StaticInner.cv);
		
		InnerExam03 loca = new InnerExam03();
		loca.myMethod();
	}

}
