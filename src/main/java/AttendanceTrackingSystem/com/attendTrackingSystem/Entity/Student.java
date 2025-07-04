package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "frn_no", nullable = false, unique = true)
    private String frnNo;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "batch_id", referencedColumnName = "batch_id")
    private Batch batch;

    public Student() {}

    public Student(String frnNo, String name, String email, boolean isActive, Batch batch) {
        this.frnNo = frnNo;
        this.name = name;
        this.email = email;
        this.isActive = isActive;
        this.batch = batch;
    }

    // --- Getters and Setters ---

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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
}
