package AttendanceTrackingSystem.com.attendTrackingSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Attendence;
import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Batch;
import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Subject;
import AttendanceTrackingSystem.com.attendTrackingSystem.Repository.AttendanceRepository;
import AttendanceTrackingSystem.com.attendTrackingSystem.Repository.BatchRepository;
import AttendanceTrackingSystem.com.attendTrackingSystem.Repository.SubjectRepository;

@Service
public class TrainerService {

    @Autowired
    private BatchRepository batchRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private AttendanceRepository attendanceRepository;

    // ✅ 1. Get all batches associated with a trainer
    public List<Batch> getBatchesByTrainerId(int trainerId) {
        return batchRepository.findByTrainer_UserId(trainerId);
    }

    // ✅ 2. Get subjects taught by a trainer in a specific batch
    public List<Subject> getSubjectsForTrainerAndBatch(int trainerId, int batchId) {
        return subjectRepository.findByTrainer_UserIdAndBatch_BatchId(trainerId, batchId);
    }

    // ✅ 3. Save attendance records submitted by the trainer
    public void saveAttendance(List<Attendence> attendanceList) {
        attendanceRepository.saveAll(attendanceList);
    }

    // ✅ 4. Check if attendance already taken for a subject on given date
    public boolean isAttendanceAlreadyMarked(String date, int subjectId) {
        return attendanceRepository.existsByDateAndSubject_SubjectId(date, subjectId);
    }
}
