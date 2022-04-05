import java.time.LocalDate;

import javax.persistence.*;

@Table(name="proj_tbl")
public class Project {

		@Id
		@Column(name="pro_id")
		@GeneratedValue
		private int projectId;
		
		@Column(name = "pro_name")
		private String pojectName;
		
		@Column(name ="pro_dl")
		private LocalDate projectDeadLine;

		public int getProjectId() {
			return projectId;
		}

		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}

		public String getPojectName() {
			return pojectName;
		}

		public void setPojectName(String pojectName) {
			this.pojectName = pojectName;
		}

		public LocalDate getProjectDeadLine() {
			return projectDeadLine;
		}

		public void setProjectDeadLine(LocalDate projectDeadLine) {
			this.projectDeadLine = projectDeadLine;
		}

		@Override
		public String toString() {
			return "Project [projectId=" + projectId + ", pojectName=" + pojectName + ", projectDeadLine="
					+ projectDeadLine + "]";
		}
		
		
}
