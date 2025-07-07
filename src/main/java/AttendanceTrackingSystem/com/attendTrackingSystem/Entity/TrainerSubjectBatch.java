package AttendanceTrackingSystem.com.attendTrackingSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Trainer_subject_batch")
public class TrainerSubjectBatch {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	  @ManyToOne @JoinColumn(name="trainer_id", nullable=false)
	  private User trainer;

	  @ManyToOne @JoinColumn(name="subject_id", nullable=false)
	  private Subject subject;

	  @ManyToOne @JoinColumn(name="batch_id", nullable=false)
	  private Batch batch;

}
