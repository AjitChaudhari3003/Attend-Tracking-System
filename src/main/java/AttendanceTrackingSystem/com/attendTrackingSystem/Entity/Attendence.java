package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

public class Attendence {
	
	private int id;
	private String frnNo;
	private String date;
	private boolean isPresent;
	
	public Attendence() {
		// TODO Auto-generated constructor stub
	}

	public Attendence(int id, String frnNo, String date, boolean isPresent) {
		this.id = id;
		this.frnNo = frnNo;
		this.date = date;
		this.isPresent = isPresent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrnNo() {
		return frnNo;
	}

	public void setFrnNo(String frnNo) {
		this.frnNo = frnNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	
	
	
	

}
  