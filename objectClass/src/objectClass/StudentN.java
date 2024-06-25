package objectClass;

public class StudentN {
	int id; // 학번
	String name; // 이름
	int subnum; // 과목 갯수
	Test[] test; // 배열 만들어주기
	
	StudentN(){}
	
	StudentN(int i, String n , int s) { 
		id = i;
		name = n;
		subnum = s;
		test = new Test[s];
		for(int j=0;j<s;j++) // 0 1 2
			test[j] = new Test();
	}
	
	String getName() { // 이름 출력
		return id + " : " + name;
	}
	
	int getGrade() {
		int sum = 0;
		for(int i=0; i<subnum; i++)
//			sum = sum + test[i].point;
		sum += test[i].point;
		return sum;
	}
	
	int getGrade(int a) {
		int base = 100 * subnum / a;
		int rank = getGrade() / base + 1;
		return rank;
	}
	void printScore() {
		System.out.println(getName());
		for(int i=0; i<subnum; i++)
		System.out.println(test[i].getPoint());
		System.out.println("---------------");
		System.out.println("총점" + getGrade());
		int rank = 5;
		System.out.println(rank + "단원평가" + getGrade(rank) + "\n");
	}
}










