package exam1;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // 연속성
@Table(name="jpamember1") // 테이블명 바꿀때 / Member1 에서 테이블이름이 들어가야하는데 다른이름이 들어가야할때 쓴다
public class Member1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrements // auto increments ?? 된다 ??
	private Long id;
	
	private String username;
	
	@Column(name="create_date") // createDate 를 -> create_date 로 바꿔주겠다
	private LocalDate createDate;
	
	public Member1() { // 기본생성자
		
	}
	


	public Member1(String username, LocalDate createDate) {
		this.username = username;
		this.createDate = createDate;
	}
	
	
}




