package objectColl;

public class Bus {
	public int number;
	public int count;
	public int money;
	
	public Bus(int number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money += money;
//		this.count++;
		count++;
	}
	
	public void showBusInfo() {
		System.out.println(number + "번 버스의 승객은 " + count + "명 이고, 수입은 " + money + "원 입니다.");
	}
}
