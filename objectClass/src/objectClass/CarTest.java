package objectClass;

public class CarTest {

	public static void main(String[] args) {
		Car firstCar = new Car("아반떼",2155);
		firstCar.num = "68더 4802";
		firstCar.print();
		
		Car secondCar = new Car("스포티지",3172);
		secondCar.num = "124모 6702";
		secondCar.print();
		
		int total = firstCar.price + secondCar.price;
		System.out.println("자동차 가격 합:" + total + "만원");
	}

}
