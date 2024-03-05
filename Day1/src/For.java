
public class For {
	public static void main(String[] args) {
		
		/*
		 * 사각형 갯수, 접은 횟수
		 * 1,0
		 * 500개 넘어가면 
		 */
		
	
		int square = 1;
		int count = 0;
		
		for(count=0; square<500; count++) {
			square <<= 1; //square *= 2; //square = square * 2;
		}
		
		System.out.println(count);
		System.out.println(square);
		
		
		
		
	}
}


//1>2>4>8... 접은횟수와 사각형 횟수 500개를 넘었을 때 