package Day2;

public class StringExam {

	public static void main(String[] args) {
		String str1 = new String("Superman");  //String str1 = "Superman";도 객체 생성된 것.
		String str2 = new String("Superman");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) { //주소값 비교
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
		
		if(str1.equals(str2)) { //문자열 비교
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
	}

}
