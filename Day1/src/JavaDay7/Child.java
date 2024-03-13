package JavaDay7;

public class Child extends Parent implements MyInterface, MyInterface2 {
	@Override
	public void method1() {
		System.out.println("method1() in child");
	}
}
