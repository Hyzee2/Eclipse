package JavaDay6;

public class MyQueue extends Memory {
	
	private int front; // 맨 앞의 위치
	
	public int pop() {
		
		return arr[front++]; // front가 1씩 늘어난다. arr[0] -> arr[1] -> arr[2] ...
		
	}
}
