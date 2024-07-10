package example1;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="JpaEx1")
public class Members1 {
	// 데이터베이스 내용 설정 시작점
	@Id
	private String country; // 나라
	
	private String profession; // 직업
	private String weapon; // 무기
	private String name; // 이름
	
	@Column(name="create_date")
	private LocalDate createDate; // 생성 시간
	// 데이터베이스 내용설정 끝점
	
	public Members1() {}

	// 객체 생성을 설정 시작점
	public Members1(String country, String profession, String weapon, String name, LocalDate createDate) {
		this.country = country;
		this.profession = profession;
		this.weapon = weapon;
		this.name = name;
		this.createDate = createDate;
	}
	// 객체 생성을 설정 끝점

	public String getCountry() {
		return country;
	}

	public String getProfession() {
		return profession;
	}

	public String getWeapon() {
		return weapon;
	}

	public String getName() {
		return name;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}
	
	
	
	
	
	
}
