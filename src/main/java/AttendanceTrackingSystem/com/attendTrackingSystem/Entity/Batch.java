package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
	

	public Batch() {
		// TODO Auto-generated constructor stub
	}

	public Batch(int batchId, String batchName, LocalTime startTime, LocalTime endTime) {
		super();
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
<<<<<<< HEAD
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
=======
>>>>>>> d06174b4b28f55519e5825eeabdf0ba910095486

}
