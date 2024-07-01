package exam2;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AddMemer2 {

	public static void main(String[] args) {
		// 한사이클 시작점
				 EntityManagerFactory emf = // emf는 EntityManagerFactory의 줄임말
			                Persistence.createEntityManagerFactory("JpaEx01");
			        EntityManager entityManager = emf.createEntityManager();
			        EntityTransaction transaction = entityManager.getTransaction();
			        
			        try {
			        	transaction.begin();
			        	
			        	Member2 user = new Member2("리그랜덤", "1234"); // Member2의 객체를불러서 데이터 삽입
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
