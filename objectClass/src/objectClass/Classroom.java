package objectClass;

public class Classroom {

	public static void main(String[] args) {
		StudentN bae = new StudentN(12,"배찬진",3);
		bae.test[0].setPoint("국어", 87);
		bae.test[1].setPoint("수학", 95);
		bae.test[2].setPoint("영어", 70);
		bae.printScore();
		
		StudentN ran = new StudentN(15,"랜덤",3);
		ran.test[0].setPoint("국어", 97);
		ran.test[1].setPoint("수학", 89);
		ran.test[2].setPoint("영어", 78);
		ran.printScore();
	}

}
