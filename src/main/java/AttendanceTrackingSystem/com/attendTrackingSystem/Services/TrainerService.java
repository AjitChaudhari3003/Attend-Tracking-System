package AttendanceTrackingSystem.com.attendTrackingSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.TrainerSubjectBatch;
import AttendanceTrackingSystem.com.attendTrackingSystem.Repository.TrainerSubjectBatchRepository;

@Service
public class TrainerService {
	
	@Autowired
	private TrainerSubjectBatchRepository trainerSubjectBatchRepository;
	
	public List<TrainerSubjectBatch> getBatchesForTrainer(int trainerId)
	{
		return trainerSubjectBatchRepository.findByTrainerId(trainerId);
	}
	
	public List<TrainerSubjectBatch> getSubjectsForTrainerAndBatch(int trainerId, int batchId)
	{
		return trainerSubjectBatchRepository.findByTrainerIdAndBatch_BatchId(trainerId, batchId);
	}

}
