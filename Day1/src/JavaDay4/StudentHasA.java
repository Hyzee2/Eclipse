package JavaDay4;
//성적처리클래스

public class StudentHasA {
	//이름은 Name 클래스
	//과목은 Subject 클래스
	//총점, 평균은 직접 필드로 만들기
	private Name name;
	private Subject kor;
	private Subject mat;
	private Subject eng;
	private int total;
	private float avg;
	
	public StudentHasA() { // 생성자 함수 
		
		name = new Name(); //객체 생성
		kor = new Subject();
		mat = new Subject();
		eng = new Subject();
		
	}
	
	/*
	 * public StudentHasA(Name name, Subject kor, Subject mat, Subject eng){
	 * 	this.name =name;
	 *  this.kor=kor;
	 *  this.mat=mat;
	 *  this.eng=eng;
	 * }
	 */
	
	public void setName(String name) {  // 외부 클래스에 있는 메서드를 사용하는 방법
		this.name.setName(name); 
	}
	
	public String getName() { 
		return name.getName();
	}
	
	public void setKor(int kor) {
		this.kor.setScore(kor);
	}
	
	public int getKor() {
		return kor.getScore();
	}
	
	public void setMat(int mat) {
		this.mat.setScore(mat);
	}
	
	public int getMat() {
		return mat.getScore();
	}
	
	public void setEng(int eng) {
		this.eng.setScore(eng);
	}
	
	public int getEng() {
		return eng.getScore();
	}
	
	public int getTotal() {
		this.total = getKor() + getMat() + getEng();
		return total;
	}
	
	public float getAvg() {
		this.avg = getTotal()/3;
		return avg;
	}
	
//	public static void main(String[] args) {
//		
//		StudentHasA stu = new StudentHasA();
//		
//		stu.setName("Superman");
//		stu.setKor(90);
//		stu.setMat(100);
//		stu.setEng(70);
//		
//		System.out.println(stu.getName());
//		System.out.println(stu.getKor());
//		System.out.println(stu.getMat());
//		System.out.println(stu.getEng());
//		System.out.println(stu.getTotal());
//		System.out.println(stu.getAvg());
//	}

}
