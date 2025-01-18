package mvc.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.spring.dao.UserDao;
import mvc.spring.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		int i = this.userDao.saveUser(user);
		return i;
	}
	
}
