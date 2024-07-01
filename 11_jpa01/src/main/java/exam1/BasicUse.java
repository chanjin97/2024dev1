package exam1;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BasicUse {

	public static void main(String[] args) {
		// 한사이클 시작점
		 EntityManagerFactory emf = // emf는 EntityManagerFactory의 줄임말
	                Persistence.createEntityManagerFactory("JpaEx01");
	        EntityManager entityManager = emf.createEntityManager();
	        EntityTransaction transaction = entityManager.getTransaction();
	        
	        try {
	        	transaction.begin();
	        	
	        	Member1 user = new Member1("배찬진", LocalDate.now()); // Member1의 객체를불러서 데이터 삽입
	        	entityManager.persist(user); // jpa의 1차 캐쉬?
	        	
	        	
	        	
	        	transaction.commit();
	        	
	        }catch(Exception e) {
	        	e.printStackTrace(); // 에러문
	        	transaction.rollback(); // 에러났을때의 롤백
	        }
	        
	        emf.close();
	        // 한사이클 종료점
	}

}
