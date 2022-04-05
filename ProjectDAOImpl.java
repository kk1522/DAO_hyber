import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class ProjectDAOImpl implements ProjectDAO {
	
	
	
	EntityManagerFactory emf;
	EntityManager em;
	public ProjectDAOImpl() {
		super();
		emf = Persistence.createEntityManagerFactory("MyJPA");
		em = emf.createEntityManager();
	}

	public void addProject(Project project) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.persist(project);
		et.commit();
		
	}

	public void updateProject(String projectId,Project project) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		Project p=em.find(Project.class, projectId);
		if(p!=null) {
			et.begin();
			em.persist(project);
			et.commit();
		}
		else{
			System.out.println("record not found");
		}
	}

	public void deleteProject(String projectId) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		Project p=em.find(Project.class, projectId);
		if(p!=null) {
			et.begin();
			em.remove(p);
			et.commit();
		}
		else{
			System.out.println("record not found");
		}
		
	}

	public Project selectProject(String projectId) {
		// TODO Auto-generated method stub
		Project p=em.find(Project.class, projectId);
		if(p!=null) {
			System.out.println("record found");
			return p;
		}
		else{
			System.out.println("record not found");
			return null;
		}
		
	}

	public ArrayList<Project> selectAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Project");
		List<Project> p =query.getResultList();
		return (ArrayList<Project>) p;
	}

}
