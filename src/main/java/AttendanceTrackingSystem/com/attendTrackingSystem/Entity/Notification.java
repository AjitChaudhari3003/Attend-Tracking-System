package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ✅ Auto-increment
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
        name = "user_id",
        referencedColumnName = "user_id",
        foreignKey = @ForeignKey(name = "fk_notification_user")
    )
    private User user;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "is_seen")
    private boolean isSeen;

    public Notification() {
    }

    public Notification(User user, String message, boolean isSeen) {
        this.user = user;
        this.message = message;
        this.isSeen = isSeen;
    }

    // --- Getters and Setters ---
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
