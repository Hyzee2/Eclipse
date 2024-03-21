package DataStructureDay04;

import JavaDay4.Name;
import JavaDay4.Subject;

public class NewStudent {
	private Name name;
	private Subject kor; 
	private Subject mat;
	private Subject eng;
	private int total;
	private float avg;
	NewStudent next;
	
	public NewStudent() {
		name = new Name();
		kor = new Subject();
		eng = new Subject();
		mat = new Subject();
	}
	
	public NewStudent(Name name, Subject kor, Subject eng, Subject mat) { // 학생의 정보를 입력받는 생성자 함수
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
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
		
		String a ="이름은 " + getName()+ ", 국어점수는 " + getKor() + ", 영어점수는 " + getEng() + ", 수학점수는 " + getMat() + ", 총점은 " + getTotal() + ", 평균은 " + getAvg();
		return a;
	}

}
