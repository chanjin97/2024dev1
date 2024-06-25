package objectClass;

public class StudentTest {

	public static void main(String[] args) {
		StudentM sLee = new StudentM(100,"배찬진");
		sLee.setKoreaSubject("국어", 80);
		sLee.setMathSubject("수학", 70);
		
		sLee.showStudentScore();
		
		StudentM sBae = new StudentM(100,"살핸");
		sBae.setKoreaSubject("국어", 87);
		sBae.setMathSubject("수학", 95);
		
		sBae.showStudentScore();
	}

}
