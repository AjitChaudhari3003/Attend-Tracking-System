package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "frn_no", nullable = false)
    private String frnNo;

    @Column(name = "is_present")
    private boolean isPresent;

    @ManyToOne
    @JoinColumn(name = "tsb_id", referencedColumnName = "id")
    private TrainerSubjectBatch trainerSubjectBatch;

    public Attendance() {}

    public Attendance(String date, String frnNo, boolean isPresent, TrainerSubjectBatch trainerSubjectBatch) {
        this.date = date;
        this.frnNo = frnNo;
        this.isPresent = isPresent;
        this.trainerSubjectBatch = trainerSubjectBatch;
    }

    // --- Getters and Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrnNo() {
        return frnNo;
    }

    public void setFrnNo(String frnNo) {
        this.frnNo = frnNo;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

	public TrainerSubjectBatch getTrainerSubjectBatch() {
		return trainerSubjectBatch;
	}

	public void setTrainerSubjectBatch(TrainerSubjectBatch trainerSubjectBatch) {
		this.trainerSubjectBatch = trainerSubjectBatch;
	}

    
}
