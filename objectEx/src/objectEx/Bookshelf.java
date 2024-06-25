package objectEx;

public class Bookshelf {

	public static void main(String[] args) {
		Novel nov = new Novel();
		nov.title = "구운몽";
		nov.genre = "고전문학";
		nov.writer = "김만중";
		
//		nov.printBook();
//		nov.printNov();
		
		Magazine mag = new Magazine();
		mag.title = "월간 자바";
		mag.genre = "컴퓨터";
		mag.day = 16;
		
		mag.printMag();
	}

}
