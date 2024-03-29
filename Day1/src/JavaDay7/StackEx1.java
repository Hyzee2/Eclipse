package JavaDay7;
import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		String[] groupA = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
		
		Stack<String> stack = new Stack<String>();
		
		for(String n : groupA) {
			System.out.print(stack.push(n)+"\t");
		}
		
		System.out.println();
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+"\t");
		}
	}

}
