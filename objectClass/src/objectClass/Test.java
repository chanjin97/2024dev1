package objectClass;

public class Test {
	String subject;
	int point;
	
//	public int getPoint() {
//		return point;
//	}
//	public void setPoint(int point) {
//		this.point = point;
//	}
	
	void setPoint(String s, int p) {
		subject = s;
		point = p;
	}
	
	String getPoint() {
		return subject + ":" + point;
	}
}
