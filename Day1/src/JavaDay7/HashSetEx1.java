package JavaDay7;
import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args) {
		String[] str = {"Apple", "Banana", "Apple", "Orange"};
		
		HashSet<String> h1 = new HashSet<String>(); //HashSet이라는 String 제네릭 객체 생성
		HashSet<String> h2 = new HashSet<String>();
		
		for(String s : str) {
			if(!h1.add(s)) //만약 str의 요소를 h1객체에 넣는다. 제네릭은 중복 요소 불가하므로 h1에 들어가지 못한다면
				h2.add(s); //h2 객체에 넣는다. 
		}
		
		System.out.println("h1 : "+h1);
		h1.removeAll(h2);
		System.out.println("reset h1 : "+h1);
		System.out.println("h2 : "+h2);
	}

}
