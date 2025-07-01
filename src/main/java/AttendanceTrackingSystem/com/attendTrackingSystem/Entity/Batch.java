package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Batches")
public class Batch {

    @Id
    @Column(name = "batch_id")
    private int batchId;

    @Column(name = "batch_name")
    private String batchName;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @OneToMany(mappedBy = "batch", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students = new ArrayList<>();

    @ManyToOne
	@JoinColumn(name = "trainer_id")  // trainer_id is a foreign key column in Batches table
	private User trainer;

	
    public Batch() {
        // Default constructor
    }

    public Batch(int batchId, String batchName, LocalTime startTime, LocalTime endTime) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Optional: helper methods to maintain bidirectional consistency
    public void addStudent(Student student) {
        students.add(student);
        student.setBatch(this);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        student.setBatch(null);
    }
}
