package objectColl;

public class TransTest {



	public static void main(String[] args) {
		Student sLee = new Student("이순신",5000);
		Student sSal = new Student("살핸",10000);
		
		Bus bus100 = new Bus(100);
		
		Subway Incheon1 = new Subway("인천1호선");
		
		sLee.takeBus(bus100);
		sSal.takeBus(bus100);
		
		sLee.takeSubway(Incheon1);
		sSal.takeSubway(Incheon1);
		
		sLee.showInfo();
		sSal.showInfo();
		System.out.println();
	
		bus100.showBusInfo();
		
		Incheon1.showSubwayInfo();
	}

}
