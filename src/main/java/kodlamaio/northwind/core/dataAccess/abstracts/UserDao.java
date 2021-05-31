package kodlamaio.northwind.core.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.core.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User getByEmail(String email);
}
