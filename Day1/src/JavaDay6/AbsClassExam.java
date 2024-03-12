package JavaDay6;

abstract class Area{ // 추상 클래스는 1개만 존재 
	
	public abstract void draw(); // 추상 메서드 중괄호 없이 바로 세미콜론
}

class Rect extends Area{
	@Override // 시각적으로 어떤 메서드인지 표기해주는 법
	public void draw() { // 추상 메서드를 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends Area{
	public void draw() {
		System.out.println("Circle");
	}
}

class Tri extends Area{
	public void draw() {
		System.out.println("Tri");
	}
}

public class AbsClassExam {

	public static void main(String[] args) {
		Tri tri = new Tri();
		tri.draw();
		
		Rect rect = new Rect();
		rect.draw();
		
		Circle cir = new Circle();
		cir.draw();
	}

}
