package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

public class Subject {
	
	private int subjectId;
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
