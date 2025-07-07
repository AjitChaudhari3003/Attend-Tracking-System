package AttendanceTrackingSystem.com.attendTrackingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.TrainerSubjectBatch;
import AttendanceTrackingSystem.com.attendTrackingSystem.Services.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
	@Autowired
	private TrainerService trainerService;
	
	@GetMapping("/{trainerId}/batches")
    public ResponseEntity<List<TrainerSubjectBatch>> getTrainerBatches(@PathVariable int trainerId) 
	{
        List<TrainerSubjectBatch> batches = trainerService.getBatchesForTrainer(trainerId);
        return ResponseEntity.ok(batches);
    }
	
	 @GetMapping("/{trainerUserId}/batch/{batchId}/subjects")
	 public ResponseEntity<List<TrainerSubjectBatch>> getSubjects(@PathVariable int trainerUserId, @PathVariable int batchId) 
	 {
	        List<TrainerSubjectBatch> subjects = trainerService.getSubjectsForTrainerAndBatch(trainerUserId, batchId);
	        return ResponseEntity.ok(subjects);
	 }

}
