package AttendanceTrackingSystem.com.attendTrackingSystem.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AttendanceTrackingSystem.com.attendTrackingSystem.Entity.User;
import AttendanceTrackingSystem.com.attendTrackingSystem.Repository.UserRepository;
@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	public User saveUser(User user)
	{
		return userRepository.save(user);
	}
	
	public Optional<User> login(String email, String password)
	{
		Optional<User> userOpt = userRepository.findByEmail(email);
		if(userOpt.isPresent())
		{
			User user = userOpt.get();
			if(user.getPassword().equals(password))
			{
				return Optional.of(user);
			}
		}
		return Optional.empty();
	}

}
