package JavaDay8;

public class AtmTwo implements Runnable {
	private long depositeMoney = 10000;

	public void run() {
		synchronized (this) { // 동기화
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();

				}
				
				if (getDepositeMoney() <= 0)
					break;
				notify();
				withDraw(1000);
				
				try {
					wait();
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}

			}

		}
	}

	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("%d %n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.println("End.");
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
}
