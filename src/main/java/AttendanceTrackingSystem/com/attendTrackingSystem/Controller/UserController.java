package AttendanceTrackingSystem.com.attendTrackingSystem.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.User;
import AttendanceTrackingSystem.com.attendTrackingSystem.Services.UserService;
import AttendanceTrackingSystem.com.attendTrackingSystem.dto.UserloginDto;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	public UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user)
	{
		User savedUser = userService.saveUser(user);
		return ResponseEntity.ok(savedUser);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody UserloginDto userloginDto)
	{
		 return userService.login(userloginDto.getEmail(), userloginDto.getPassword())
	                .map(user -> ResponseEntity.ok().body("Login Successfull")) //returns this if success
	                .orElse(ResponseEntity.status(401).body("Invalid email or password")); //returns this if email or pass not found
	}

}
