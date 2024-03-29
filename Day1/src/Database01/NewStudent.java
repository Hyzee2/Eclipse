package Database01;

import JavaDay4.Name;
import JavaDay4.Subject;

public class NewStudent {
	private Name name;
	private Subject kor; 
	private Subject mat;
	private Subject eng;
	private int id;
	private int total;
	private float avg;
	NewStudent next; // NewStudent 객체의 다음을 가리키는 참조변수  
	
	public NewStudent() {
		id = 0;
		name = new Name();
		kor = new Subject();
		eng = new Subject();
		mat = new Subject();
	}
	
	public NewStudent(int id, Name name, Subject kor, Subject eng, Subject mat) { // 학생의 정보를 입력받는 생성자 함수
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.next = null;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setName(String name) { // 외부 클래스에 있는 메서드를 사용하는 방법
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
		this.avg = getTotal() / 3;
		return avg;
	}

	@Override
	public String toString() {
		
		String a ="id: "+getId()+", 이름: " + getName()+ ", 국어점수: " + getKor() + ", 영어점수: " + getEng() + ", 수학점수: " + getMat() + ", 총점: " + getTotal() + ", 평균: " + getAvg();
		return a;
	}

}
