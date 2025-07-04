package AttendanceTrackingSystem.com.attendTrackingSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Attendence;

public interface AttendanceRepository extends JpaRepository<Attendence, Integer> {
    List<Attendence> findByFrnNoAndSubject_SubjectId(String frnNo, int subjectId);
    List<Attendence> findBySubject_SubjectId(int subjectId);
	boolean existsByDateAndSubject_SubjectId(String date, int subjectId);
}

public class AttendanceRepository extends JpaRepository<>{
	List<Attendence> findByFrnNoAndDate(String frnNo, String date);
}
