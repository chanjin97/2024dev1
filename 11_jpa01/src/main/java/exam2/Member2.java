package exam2;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity

@Table(name="JpaMember2")
public class Member2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Access(AccessType.FIELD)
	private String username;
	@Access(AccessType.PROPERTY) // get , set 로만 접근한다??
	private String password;
	
	@Transient // 아래의 테이블 안생기게함
	private long timestamp1; // 위에 Long 과 현재줄의 long은 다르다
	
	public Member2 () {}

	public Member2(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}






