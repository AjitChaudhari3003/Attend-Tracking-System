package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "subject_name", nullable = false)
    private String subjectName;

    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalTime endTime;

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

    public Subject(String subjectName, LocalTime startTime, LocalTime endTime, User trainer, Batch batch, User coordinator) {
        this.subjectName = subjectName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.trainer = trainer;
        this.batch = batch;
        this.coordinator = coordinator;
    }

    // --- Getters and Setters ---

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
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
