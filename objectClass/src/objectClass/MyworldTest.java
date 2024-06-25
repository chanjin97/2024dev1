package objectClass;

public class MyworldTest {

	public static void main(String[] args) {
		World korea = new World("대한민국",4);
//		korea.count = 10;
		korea.setCount(15);
//		korea.setName("보라카이");
		
//		System.out.println(korea.count);
		System.out.println(korea.getName());
	}

}
