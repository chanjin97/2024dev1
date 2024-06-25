package objectClass;

public class StudentM {
	int id; // 학번
	String name; // 이름
	
	Subject korea;
	Subject math;
	
	StudentM(int id, String name){
		this.id = id;
		this.name = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		
		
	}
	void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
		
	}
	void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(name + "학생의 총점은 " + total + "입니다.");
	}
}
