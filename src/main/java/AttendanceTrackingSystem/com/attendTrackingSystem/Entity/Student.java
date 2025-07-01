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
@Table(name = "Students")
public class Student {
	
	@Id
	@Column(name = "frn_no")
	private String frnNo;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
        name = "batch_id", 
        referencedColumnName = "batch_id", 
        foreignKey = @ForeignKey(name = "fk_student_batch")
    )
    private Batch batch;
	@Column(name = "is_active")
	private boolean isActive;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String frnNo, String name, String email, Batch batch, boolean isActive) {
		this.frnNo = frnNo;
		this.name = name;
		this.email = email;
		this.batch = batch;
		this.isActive = isActive;
	}

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

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}
