package JavaDay7;
import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		
		String[] color = {"red", "blue", "green", "yellow", "black"};
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0; i<color.length; i++) {
			map.put(i, color[i]);
		}
		
		Set<Integer> keys = map.keySet();
			for(Integer n : keys) {
				System.out.print(map.get(n)+"\t");
			}
		System.out.println();
		System.out.println(map.get(3));	
	}

}
