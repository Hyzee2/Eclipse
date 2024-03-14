package JavaDay8;

public class WaitNotifyEx {

	public static void main(String[] args) {
		AtmTwo atm = new AtmTwo(); //여러 쓰레드가 공유하는 객체 
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		mother.start();
		son.start();
		

	}

}
