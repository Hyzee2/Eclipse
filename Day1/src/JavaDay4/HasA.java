package JavaDay4;

class A {
	private int a;

	public A() {
		System.out.println("A");
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}
}

public class HasA {

	private String name;
	private A age;

	public HasA() { // 생성자 함수를 통해 객체 생성
		System.out.println("HasA");
		name = "";
		age = new A();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age.setA(age); // 개념적으로는 this.age = age;
							// this.age.a = age;가 불가능한 이유는 클래스 A의 필드는 직접 접근 불가능
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return this.age.getA();
	}

	public static void main(String[] args) {
		HasA has = new HasA(); //객체 생성시, 생성자 함수로 이동한다!!! 47 >  24 > 6 > 47줄로 돌아오는 과정을 수행한다.
		has.setName("Superman");
		has.setAge(150);

		System.out.println(has.getName());
		System.out.println(has.getAge());
	}

}
