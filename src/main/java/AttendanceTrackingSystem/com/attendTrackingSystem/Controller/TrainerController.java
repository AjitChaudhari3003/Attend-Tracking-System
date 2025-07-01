package AttendanceTrackingSystem.com.attendTrackingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    // ✅ 1. Get Batches for Logged-In Trainer
    @GetMapping("/dashboard")
    public List<Batch> getTrainerBatches(HttpSession session) {
        User user = (User) session.getAttribute("user");

        if (!"trainer".equalsIgnoreCase(user.getRole())) {
            throw new RuntimeException("Access denied. Only trainers can access this.");
        }

        return trainerService.getBatchesByTrainerId(user.getUserId());
    }

    // ✅ 2. Get Subjects Trainer Teaches in a Batch
    @GetMapping("/batch/{batchId}/subjects")
    public List<Subject> getSubjectsForBatch(@PathVariable int batchId, HttpSession session) {
        User user = (User) session.getAttribute("user");

        if (!"trainer".equalsIgnoreCase(user.getRole())) {
            throw new RuntimeException("Access denied. Only trainers can access this.");
        }

        return trainerService.getSubjectsForTrainerAndBatch(user.getUserId(), batchId);
    }


}
