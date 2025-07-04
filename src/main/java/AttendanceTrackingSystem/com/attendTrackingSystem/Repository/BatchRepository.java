package AttendanceTrackingSystem.com.attendTrackingSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Batch;

public interface BatchRepository extends JpaRepository<Batch, Integer> {
    List<Batch> findByTrainer_UserId(int trainerId);
}
