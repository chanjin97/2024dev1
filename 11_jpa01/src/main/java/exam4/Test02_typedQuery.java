package exam4;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Test02_typedQuery {

	public static void main(String[] args) {
		// 한사이클 시작점
		 EntityManagerFactory emf = // emf는 EntityManagerFactory의 줄임말
	                Persistence.createEntityManagerFactory("JpaEx01");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction transaction = em.getTransaction();
	        
	        try {
	        	transaction.begin();
	        	
	        	// TypedQuery의 '형'을 넣어야한다 그것이 Member4
	        	TypedQuery<Member4> query = em.createQuery(
	        			"select m from Member4 m oder by m.name",
	        			Member4.class);
	        	List<Member4> result = query.getResultList();
	        	
	        	transaction.commit(); // commit을 하게되면 데이터 들어가는것
	        	System.out.println("성공");

	        	// 조건문이 나온다
	        	if(result.isEmpty()) { // result값이 Empty(없으면) 이면은 system.out.println 발동
	        		System.out.println("사용자가 없습니다.");
	        	}else {
	        		// forEach문을 사용할때는 람다를 사용한다 람다란 '()=>{}'를 사용했던것과같이 '->'만 쓴다
	        		result.forEach(user->
	        		System.out.printf("| %s | %s | %tY - %<tm - %<td | \n",
	        				user.getEmail(),
	        				user.getName(),
	        				user.getCreateDate()
	        				));
	        	}
	        	
	        }catch(Exception e) {
	        	e.printStackTrace(); // 에러문
	        	transaction.rollback(); // 에러났을때의 롤백
	        } finally {
	        	em.close();
	        }
	        
	        emf.close();
	        // 한사이클 종료점
	}

}
