package JavaDay4;

class ScoreInput { // 학생 성적 입력  
	//이름은 Name 클래스
	//과목은 Subject 클래스
	//총점, 평균은 직접 필드로 만들기
	private Name name;
	private Subject kor;
	private Subject eng;
	private Subject mat;
	private int total;
	private float avg;
	
	public ScoreInput() { // 생성자함수로 객체 생성하는 초기화 선언해주기 
		name = new Name();
		kor = new Subject();
		eng = new Subject();
		mat = new Subject();
		
	}
	
	public ScoreInput(Name name, Subject kor, Subject eng, Subject mat) { // 생성자함수로 객체 생성하는 초기화 선언해주기 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void setName(String name) { 
		this.name.setName(name);
		
	}
	
	public String getName() { 
		return this.name.getName();
	}
	
	public void setKor(int kor) { //setKor라고 현재 클래스에서 setter 메서드 만들어주는 것  
		this.kor.setScore(kor); // 현재 클래스의 필드인 kor은 Subject클래스의 setScore 메서드를 이용  
		
	}

	public int getKor() {
		return kor.getScore();
	}
	
	public void setEng(int eng) { 
		this.eng.setScore(eng);  
	}

	public int getEng() {
		return eng.getScore();
	}
	
	public void setMat(int mat) { 
		this.mat.setScore(mat);  
	}

	public int getMat() {
		return mat.getScore();
	}
	
	public int getTotal() { // total과 avg는 입력된 점수를 바탕으로 getter 만 해주면 되므로 
		total = getKor() + getEng() + getMat();
		return total;
	}
	
	public float getAvg() {
		avg = (float)getTotal() / 3; // 간단하게 앞에 만들어둔 getTotal()을 사용할 수 있음  
		return avg;
	}
	
}
