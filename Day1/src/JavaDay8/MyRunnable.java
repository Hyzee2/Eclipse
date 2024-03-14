package JavaDay8;

public class MyRunnable implements Runnable {

	public void run() {
		System.out.println("run");
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}
	
	public void second() {
		System.out.println("second");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" start");
		Runnable r = new MyRunnable();
		Thread myThread = new Thread(r);
		myThread.start(); // main도 쓰레드이기 때문에 myThread가 아닌 main이 먼저 끝난다. 
		try { // blocked 처리해줄 때 예상하지 못한 문제가 발생할 수도 있기 때문에 예외 처리 해준다. 
			myThread.join(); // join 은 main을 blocked 처리해준다. myThread가 끝난 후에 나머지 main 쓰레드 실행 
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end");
	}

}
