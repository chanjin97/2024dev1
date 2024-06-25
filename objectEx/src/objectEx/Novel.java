package objectEx;

public class Novel extends Book {
	String writer;
	
	void printNov () {
		printBook();
		System.out.println("저자: " + writer);
	}
}
