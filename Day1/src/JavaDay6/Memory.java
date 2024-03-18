package JavaDay6;

import java.util.Arrays;

abstract class Memory { //추상클래스
	
	int[] arr;
	int top; //마지막 위치
	
	public Memory() {
		this.arr = new int[5];
		this.top=0;
	}
	
	public abstract int pop(); //추상메서드 
	
	
	public void push(int data) {
		this.arr[top++] = data; //arr[0]=d1, arr[1]=d2, arr[2]=d3, arr[3]=d4. arr[4]=d5
	}

	
}
