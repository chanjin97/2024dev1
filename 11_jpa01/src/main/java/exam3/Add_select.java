package exam3;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Add_select {

	public static void main(String[] args) {
		// 한사이클 시작점
		 EntityManagerFactory emf = // emf는 EntityManagerFactory의 줄임말
	                Persistence.createEntityManagerFactory("JpaEx01");
	        EntityManager entityManager = emf.createEntityManager();
	        EntityTransaction transaction = entityManager.getTransaction();
	        
	        Member3 user = entityManager.find(Member3.class, "test@test.com"); // id 값으로 찾는것임
	        
	        if(user != null ) {
	        	System.out.println("이름 : " + user.getName());
	        	System.out.printf("생성 : %tY - %<tm - %<td\n",user.getCreateDate());
	        }else {
	        	System.out.println("데이터가 없습니다!");
	        }
	        
	        
	        
	        entityManager.close();
	        emf.close();
	        // 한사이클 종료점
	}

}
