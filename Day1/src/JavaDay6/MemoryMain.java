package JavaDay6;
import java.util.Scanner;
public class MemoryMain {

	public static void main(String[] args) {
		
		MyStack ms = new MyStack();
		MyQueue mq = new MyQueue();
		Memory m;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1.Stack 2.Queue 3.exit");
			int num = sc.nextInt();
			
			if(num == 1) {
				m=ms; //동적바인딩 
			}else{
				m=mq;
				//if(m.arr[m.front] != 0)
			}
			
//			if(num == 1) {
//				
				while(true) {
					System.out.print("1.push 2.pop 3.back");
					
					int n = sc.nextInt();
					
					if(n == 1) {
						m.push(sc.nextInt()); //push는 매개변수 int data를 받는다. 
						
					}else if(n == 2) {
						System.out.println(m.pop());						
					}else break; // break는 while문 벗어남. 
				}
//			}else if(num == 2) {
//				
//				while(true) {
//					System.out.print("1.push 2.pop 3.back");
//					
//					int n = sc.nextInt();
//					
//					if(n == 1) {
//						mq.push(sc.nextInt());
//						
//					}else if(n == 2) {
//						System.out.println(mq.pop());
//					}else break;
//				}
//			}else System.exit(0);
//		
		}while(true); // while 조건식이 true 이므로 do문은 계속 수행된다. 
//	
	}
	

}
