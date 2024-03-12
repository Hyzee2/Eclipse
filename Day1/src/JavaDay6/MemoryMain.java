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
				m=ms;
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
						m.push(sc.nextInt());
						
					}else if(n == 2) {
						System.out.println(m.pop());						
					}else break;
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
		}while(true);
//	
	}
	

}
