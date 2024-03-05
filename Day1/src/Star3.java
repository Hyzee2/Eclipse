
public class Star3 {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int q = 0; q < i; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
