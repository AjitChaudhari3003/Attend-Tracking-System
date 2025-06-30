package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject {
	
	@Id
	@Column(name = "subject_id")
	private int subjectId;
	@Column(name = "subject_name")
	private String subName;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(int subjectId, String subName) {
		this.subjectId = subjectId;
		this.subName = subName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	
	
	

}
