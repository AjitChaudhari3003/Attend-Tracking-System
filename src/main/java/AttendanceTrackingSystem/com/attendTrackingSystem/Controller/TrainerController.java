package AttendanceTrackingSystem.com.attendTrackingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Attendence;
import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Batch;
import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.Subject;
import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.User;
import AttendanceTrackingSystem.com.attendTrackingSystem.Services.TrainerService;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/trainer")
@CrossOrigin(origins = "*")
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    // ✅ 1. Get batches for the logged-in trainer
    @GetMapping("/dashboard")
    public List<Batch> getTrainerBatches(HttpSession session) {
        User user = (User) session.getAttribute("user");

        if (user == null || !"trainer".equalsIgnoreCase(user.getRole())) {
            throw new RuntimeException("Access denied or session expired.");
        }

        return trainerService.getBatchesByTrainerId(user.getUserId());
    }

    // ✅ 2. Get subjects the trainer teaches in the selected batch
    @GetMapping("/batch/{batchId}/subjects")
    public List<Subject> getSubjectsForBatch(@PathVariable int batchId, HttpSession session) {
        User user = (User) session.getAttribute("user");

        if (user == null || !"trainer".equalsIgnoreCase(user.getRole())) {
            throw new RuntimeException("Access denied or session expired.");
        }

        return trainerService.getSubjectsForTrainerAndBatch(user.getUserId(), batchId);
    }

    // ✅ 3. Submit attendance
    @PostMapping("/attendance")
    public ResponseEntity<String> submitAttendance(@RequestBody List<Attendence> attendanceList) {
        if (attendanceList == null || attendanceList.isEmpty()) {
            return ResponseEntity.badRequest().body("Attendance list is empty");
        }

        // Extract subject ID and date from the first attendance entry
        String date = attendanceList.get(0).getDate();
        int subjectId = attendanceList.get(0).getSubject().getSubjectId();

        // Check if attendance already marked
        if (trainerService.isAttendanceAlreadyMarked(date, subjectId)) {
            return ResponseEntity.badRequest().body("Attendance already marked for this subject on this date");
        }

        trainerService.saveAttendance(attendanceList);
        return ResponseEntity.ok("Attendance submitted successfully");
    }
}
