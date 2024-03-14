package JavaDay8;

public class SingleThreadEx implements Runnable { // extends Thread { //쓰레드 상속받아서 생성하는 방법

	private int[] temp;
	String threadname;

	public SingleThreadEx() {
		// super(threadname);
		temp = new int[10];
		for (int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}

	}

	public void run() {

		for (int start : temp) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("현재 쓰레드 이름 : %s, ", Thread.currentThread().getName()); // 현재 쓰레드 이름을 얻어와라
			System.out.printf("temp value : %d %n", start);
		}

	}

	public static void main(String[] args) {

		SingleThreadEx st = new SingleThreadEx(); // SingleThreadEx클래스 자체가 thread가 아니기 때문에 thread 객체를 직접 만들어야 한다.
//		Thread th = new Thread(st); //= new Thread("Superman"); //문자열을 받는 Thread 객체 생성 
//		th.setName("Superman");
		Thread th = new Thread(st, "Superman");
		th.start();
	}

}
