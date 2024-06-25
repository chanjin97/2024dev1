package objectClass;

public class BookTest {

	public static void main(String[] args) {
		Book books = new Book("그림책",34000);
		books.num = 10;
		books.print(); // 함수호출
		
		Book bookFirst = new Book("만화책",9900);
		bookFirst.num = 100;
		bookFirst.print();
		
	
	}
	

}
