import java.util.ArrayList;

public interface ProjectDAO {

	public void addProject(Project project);
	public void updateProject(String projectId,Project project);
	public void deleteProject(String projectId);
	public Project selectProject(String projectId);
	public ArrayList<Project> selectAll();
}
