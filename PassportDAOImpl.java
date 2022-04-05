import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PassportDAOImpl implements PassportDAO {

	EntityManagerFactory emf;
	EntityManager em;
	public PassportDAOImpl() {
		super();
		emf = Persistence.createEntityManagerFactory("MyJPA");
		em = emf.createEntityManager();
	}

	public void addPassport(Passport passport) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.persist(passport);
		et.commit();
		
	}

	public void updatePassport(String passportId,Passport passport) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		Passport p=em.find(Passport.class, passportId);
		if(p!=null) {
			et.begin();
			em.persist(passport);
			et.commit();
		}
		else{
			System.out.println("record not found");
		}
	}

	public void deletePassport(String passportId) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		Passport p=em.find(Passport.class, passportId);
		if(p!=null) {
			et.begin();
			em.remove(p);
			et.commit();
		}
		else{
			System.out.println("record not found");
		}
		
	}

	public Passport selectPassport(String passportId) {
		// TODO Auto-generated method stub
		Passport p=em.find(Passport.class, passportId);
		if(p!=null) {
			System.out.println("record found");
			return p;
		}
		else{
			System.out.println("record not found");
			return null;
		}
		
	}

	public ArrayList<Passport> selectAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Passport");
		List<Passport> p =query.getResultList();
		return (ArrayList<Passport>) p;
	}


}
