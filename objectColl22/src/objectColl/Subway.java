package objectColl;

public class Subway {
	public String name;
	public int count;
	public int money;
	
	public Subway(String name) {
		this.name = name;
	}
	
	public void take(int money) {
		this.money += money;
		count++;
	}
	
	public void showSubwayInfo () {
		System.out.println("지하철 " + name + "의 승객은 " + count + "명 이고, 수입은 " + money + "원 입니다.");
	}
}
