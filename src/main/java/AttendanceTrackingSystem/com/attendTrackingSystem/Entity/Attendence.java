package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Attendance")
public class Attendence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    @Column(name = "id")
    private int id;

    @Column(name = "frn_no")
    private String frnNo;

    @Column(name = "date")
    private String date;

    @Column(name = "is_present")
    private boolean isPresent;

    @ManyToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "subject_id")
    private Subject subject;

    public Attendence() {
    }

    public Attendence(int id, String frnNo, String date, boolean isPresent, Subject subject) {
        this.id = id;
        this.frnNo = frnNo;
        this.date = date;
        this.isPresent = isPresent;
        this.subject = subject;
    }

    // --- Getters and Setters ---
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

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
