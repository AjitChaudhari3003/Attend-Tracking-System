package AttendanceTrackingSystem.com.attendTrackingSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.TrainerSubjectBatch;
@Repository
public interface TrainerSubjectBatchRepository extends JpaRepository<TrainerSubjectBatch, Integer> {
	
	List<TrainerSubjectBatch> findByTrainerId(int trainerId);
	
	List<TrainerSubjectBatch> findByTrainerIdAndBatch_BatchId(int trainerId, int batchId);

}
