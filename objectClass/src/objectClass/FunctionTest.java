package objectClass;

public class FunctionTest {

	public static int addNum(int num1,int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		int i;
		
		for(i=0;i<=100;i++) {
			sum += i; // sum = sum + i 
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int total = addNum(10,10); // 위에 addNum의 인자로 이동
		
		System.out.println(total);
		
		sayHello("안녕 반가워");
		
		int num = calcSum();
		System.out.println("합은 : " + num);
	}

}
