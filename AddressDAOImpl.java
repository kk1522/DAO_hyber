import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AddressDAOImpl implements AddressDAO {

	EntityManagerFactory emf;
	EntityManager em;
	public AddressDAOImpl() {
		super();
		emf = Persistence.createEntityManagerFactory("MyJPA");
		em = emf.createEntityManager();
	}

	public void addAddress(Address Address) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.persist(Address);
		et.commit();
		
	}

	public void updateAddress(String AddressId,Address Address) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		Address p=em.find(Address.class, AddressId);
		if(p!=null) {
			et.begin();
			em.persist(Address);
			et.commit();
		}
		else{
			System.out.println("record not found");
		}
	}

	public void deleteAddress(String AddressId) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		Address p=em.find(Address.class, AddressId);
		if(p!=null) {
			et.begin();
			em.remove(p);
			et.commit();
		}
		else{
			System.out.println("record not found");
		}
		
	}

	public Address selectAddress(String AddressId) {
		// TODO Auto-generated method stub
		Address p=em.find(Address.class, AddressId);
		if(p!=null) {
			System.out.println("record found");
			return p;
		}
		else{
			System.out.println("record not found");
			return null;
		}
		
	}

	public ArrayList<Address> selectAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Address");
		List<Address> p =query.getResultList();
		return (ArrayList<Address>) p;
	}

}
