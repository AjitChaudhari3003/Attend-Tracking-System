package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "batches")
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "batch_id")
    private int batchId;

    @Column(name = "batch_name", nullable = false)
    private String batchName;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;


    @ManyToOne
    @JoinColumn(name = "trainer_id", referencedColumnName = "user_id")
    private User trainer;

    @OneToMany(mappedBy = "batch", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students = new ArrayList<>();

    public Batch() {}

    public Batch(String batchName, LocalDate startDate, LocalDate endDate) {
        this.batchName = batchName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // --- Getters and Setters ---

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Optional helper methods
    public void addStudent(Student student) {
        students.add(student);
        student.setBatch(this);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        student.setBatch(null);
    }
}
