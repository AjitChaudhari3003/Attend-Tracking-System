package AttendanceTrackingSystem.com.attendTrackingSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Batch;
import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Subject;
import AttendanceTrackingSystem.com.attendTrackingSystem.Repository.BatchRepository;
import AttendanceTrackingSystem.com.attendTrackingSystem.Repository.SubjectRepository;

@Service
public class TrainerService {
	
	@Autowired
    private BatchRepository batchRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Batch> getBatchesByTrainerId(int trainerId) {
        return batchRepository.findByTrainer_UserId(trainerId);
    }

    public List<Subject> getSubjectsForTrainerAndBatch(int trainerId, int batchId) {
        return subjectRepository.findByTrainerIdAndBatchId(trainerId, batchId);
    }


}
