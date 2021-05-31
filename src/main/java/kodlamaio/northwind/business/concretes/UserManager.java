package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.abstracts.UserDao;
import kodlamaio.northwind.core.entities.concretes.User;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.core.results.SuccessDataResult;
import kodlamaio.northwind.core.results.SuccessResult;
@Service
public class UserManager implements UserService{
	UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		userDao.save(user);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(userDao.findAll());
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		
		return new SuccessDataResult<User>(userDao.getByEmail(email));
	}

}
