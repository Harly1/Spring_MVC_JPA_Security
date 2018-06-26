package example.service_abstract;




import example.model.User;

import java.util.List;

public interface UserService {
	void addUser(User user);
	void removeUser(User user);
	void updateUser(User user);

	List<User> getAllUsers();
	User getUserByLogin(String username);
	User getUserById(Long id);
}
