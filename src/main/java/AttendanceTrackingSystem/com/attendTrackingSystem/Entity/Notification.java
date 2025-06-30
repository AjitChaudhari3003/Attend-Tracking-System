package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Notifications")
public class Notification {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "message")
	private String message;
	@Column(name = "is_seen")
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
