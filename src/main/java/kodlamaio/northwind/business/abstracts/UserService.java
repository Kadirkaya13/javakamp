package kodlamaio.northwind.business.abstracts;


import java.util.List;

import kodlamaio.northwind.core.entities.concretes.User;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<List<User>> getAll();
	DataResult<User> getByEmail(String email);
}
