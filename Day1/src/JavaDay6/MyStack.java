package JavaDay6;

class MyStack extends Memory {

	@Override
	public int pop() {

		return arr[--top];
	}

}
