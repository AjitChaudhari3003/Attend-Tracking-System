package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

public class Student {
	
	private String frnNo;
	private String name;
	private String email;
	private int batchId;
	private boolean isActive;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String frnNo, String name, String email, int batchId, boolean isActive) {
		this.frnNo = frnNo;
		this.name = name;
		this.email = email;
		this.batchId = batchId;
		this.isActive = isActive;
	}

	public String getFrnNo() {
		return frnNo;
	}

	public void setFrnNo(String frnNo) {
		this.frnNo = frnNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}
