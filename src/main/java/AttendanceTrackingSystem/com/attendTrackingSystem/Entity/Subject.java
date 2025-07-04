package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // optional: makes subjectId auto-increment
    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "subject_name", nullable = false)
    private String subName;

    @ManyToOne
    @JoinColumn(name = "trainer_id", referencedColumnName = "user_id")
    private User trainer;

    @ManyToOne
    @JoinColumn(name = "batch_id", referencedColumnName = "batch_id")
    private Batch batch;

    @ManyToOne
    @JoinColumn(name = "coordinator_id", referencedColumnName = "user_id")
    private User coordinator;

    public Subject() {}

    public Subject(String subName, User trainer, Batch batch, User coordinator) {
        this.subName = subName;
        this.trainer = trainer;
        this.batch = batch;
        this.coordinator = coordinator;
    }

    // --- Getters & Setters ---

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

    public User getTrainer() {
        return trainer;
    }

    public void setTrainer(User trainer) {
        this.trainer = trainer;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public User getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(User coordinator) {
        this.coordinator = coordinator;
    }
}
