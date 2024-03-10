
public class Star3 {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int j=2; j>i; j--) { //i=0 -> j=0,1    i=1 -> j=0
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
			
			}
		}
}
  
	
