package JavaDay6;

public class Array {
	int[] arr;
	int top; 
		
	public Array() {
		this.arr = new int[5];
		this.top=0;
	}
				
	public void push(int data) {
		this.arr[top++] = data; //arr[0]=d1, arr[1]=d2, arr[2]=d3...
	}			

	public int pop(int top) {
		
		return arr[top];
	}
	
	public static void main(String[] args) {
		
		Array ar = new Array();
		
		ar.push(10);
		
		for(int i=ar.top; i>=0; i--) {
			ar.arr[i-1] = ar.arr[i];
		}
		
		System.out.println(ar.arr[ar.top]);
		
	}

}
