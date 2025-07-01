package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Notifications")
public class Notification {
	
	@Id
	@Column(name = "id")
	private int id;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "user_id",
        foreignKey = @ForeignKey(name = "fk_notification_user")
    )
    private User user;
	@Column(name = "message")
	private String message;
	@Column(name = "is_seen")
	private boolean isSeen;
	
	public Notification() {
		// TODO Auto-generated constructor stub
	}

	public Notification(int id, User user, String message, boolean isSeen) {
		super();
		this.id = id;
		this.user = user;
		this.message = message;
		this.isSeen = isSeen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
