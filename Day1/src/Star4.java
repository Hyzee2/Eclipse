
public class Star4 {
	public static void main(String[] args) {
		for(int i=1; i<4; i++) {
			for(int j=3; j-1>=i; j--) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//1일때 3번째 자리에 1개(빈자리는 4개)
//2일때 2~4번째 자리에 3개(빈자리는 2개) 
//3일때 1~5번째 자리에 5개(빈자리는 0개)