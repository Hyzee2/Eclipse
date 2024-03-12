package JavaDay6;

class MyStack extends Memory {		

	@Override
	public int pop() {
		
//		return arr[--top]; // top이 1씩 줄어든다. arr[5] -> arr[4] -> arr[3] ...
		
		arr[top-1]=arr[top];
		
		if(top 5) {
			for(int i=top; i>=0; i--) {
				arr[i-1] = arr[i];
			}
		}
		
		
		return arr[top];
	}
	
	public static void main(String[] args) {
		
		MyStack ms = new MyStack();
		ms.push(10);
		ms.push(20);
		ms.push(30);
		ms.push(40);
		ms.push(50);
		
		ms.pop();
		
		System.out.println(ms.arr[ms.top]);
	}
	
}


