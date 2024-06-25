package objectClass;

public class Car {
	int price;
	String num;
	String title;
	
	Car() {}
	
	Car(String title,int price){
		this.title = title;
		this.price = price;
	}
	
	void print() {
		System.out.println("차 이름:" + title);
		System.out.println("차량 번호:" + num);
		System.out.println("차 가격:" + price + "만원" + "\n");
	}
}
