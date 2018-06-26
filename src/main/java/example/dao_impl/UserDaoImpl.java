package example.dao_impl;


import example.dao_abstract.UserDao;
import example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public void removeUser(User user) {
		User userFromDB = entityManager.find(User.class, user.getId());
		entityManager.remove(userFromDB);
//		entityManager.remove(user); //говорит, что детачт
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
	}


	@Override
	public List<User> getAllUsers() {
		return (List<User>) entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
	}

	public User getUserByLogin(String login) {
		return entityManager.createQuery("SELECT u FROM User u WHERE u.login =:login", User.class).setParameter("login", login).getSingleResult();
	}

	@Override
	public User getUserById(Long id) {
		return entityManager.createQuery("SELECT u FROM User u WHERE u.id =:id", User.class).setParameter("id", id).getSingleResult();

	}

}
