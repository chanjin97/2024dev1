package exam3;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Add_update {

	public static void main(String[] args) {
		// 한사이클 시작점
		 EntityManagerFactory emf = // emf는 EntityManagerFactory의 줄임말
	                Persistence.createEntityManagerFactory("JpaEx01");
	        EntityManager entityManager = emf.createEntityManager();
	        EntityTransaction transaction = entityManager.getTransaction();
	        
	        try {
	        	transaction.begin();
	        	
	        	Member3 user = entityManager.find(Member3.class, "test@test.com");
	        	
	        	if(user == null) {
	        		System.out.println("존재하지 않습니다.");
	        		transaction.rollback(); // 에러났을때의 롤백
	        		return;
	        	}
	        	
	        	user.changeName("살핸");
	        	
	        	transaction.commit(); // commit을 하게되면 데이터 들어가는것
	        	System.out.println("이름이 변경되었습니다.");
	        	
	        }catch(Exception e) {
	        	e.printStackTrace(); // 에러문
	        	transaction.rollback(); // 에러났을때의 롤백
	        } finally {
	        	entityManager.close();
	        }
	        
	        emf.close();
	        // 한사이클 종료점
	}

}
