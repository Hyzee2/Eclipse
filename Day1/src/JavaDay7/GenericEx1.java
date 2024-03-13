package JavaDay7;

public class GenericEx1 <T>{
	T[] v;
	
	public void set(T[] n) {
		v=n;
	}
	
	public void print() {
		for(T s:v) {
			System.out.print(s+"\t"
					+ "");
		}
	}


public static void main(String[] args) {
	GenericEx1<String> t = new GenericEx1<String>();
	
	String[] arr = {"김", "이", "박"};
	t.set(arr);
	t.print();
	
	System.out.println();
	
	GenericEx1<Integer> m =new GenericEx1<Integer>();
	
	Integer[] arr2 = {1, 2, 3};
	m.set(arr2);
	m.print();
	
	
	}
}