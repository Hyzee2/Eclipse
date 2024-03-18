package JavaDay6;

class MyStack extends Memory { //Memory 상속

	@Override
	public int pop() {

		return arr[--top]; //arr[4], arr[3], arr[2], arr[1], arr[0]
	}

}
