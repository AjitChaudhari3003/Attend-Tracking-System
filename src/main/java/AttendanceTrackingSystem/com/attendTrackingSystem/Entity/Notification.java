package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

public class Notification {
	
	private int id;
	private int userId;
	private String message;
	private boolean isSeen;
	
	public Notification() {
		// TODO Auto-generated constructor stub
	}

	public Notification(int id, int userId, String message, boolean isSeen) {
		this.id = id;
		this.userId = userId;
		this.message = message;
		this.isSeen = isSeen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSeen() {
		return isSeen;
	}

	public void setSeen(boolean isSeen) {
		this.isSeen = isSeen;
	}
	
	
	
	

}
