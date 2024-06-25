package objectClass; // 파일명

public class Book {
	int price;
	int num;
	String title;
	
	Book(){} // 오버로딩
	
//	Book(String title,int price){
//		this.title = title;
//		this.price = price;
//	}
	
	Book(String t,int p){
		title = t;
		price = p;
	}
	
	void print() {
		System.out.println("제목:" + title);
		System.out.println("가격:" + price);
		System.out.println("주문수량:" + num);
		System.out.println("합계:" + price * num);
	}
	
	
//	int sum () {
//		return price * num;
//	}
}
