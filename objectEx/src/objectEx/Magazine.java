package objectEx;

public class Magazine extends Book {
	int day = 0;

	void printMag() {
		printBook();
		System.out.println("발매일: " + day + "일");
		
	}
}
