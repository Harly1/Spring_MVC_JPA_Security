package example.service_impl;


import example.dao_abstract.UserDao;
import example.model.User;
import example.service_abstract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDAO;

	@Override
	public User getUserByLogin(String username) { return userDAO.getUserByLogin(username); }
	@Override
	public User getUserById(Long id) {return userDAO.getUserById(id);}

	@Override
	public void addUser(User user) {userDAO.addUser(user); }

	@Override
	public void removeUser(User user) {
		userDAO.removeUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

}
