package AttendanceTrackingSystem.com.attendTrackingSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
	
    List<Subject> findByTrainerIdAndBatchId(int trainerId, int batchId);

}
