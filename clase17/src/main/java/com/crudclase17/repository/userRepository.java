package com.crudclase17.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudclase17.entity.User;

@Repository
public interface userRepository extends JpaRepository<User, Long>{
	User saveUser(User User);
	void deleteById(Long id);
	User updateUser(User user,Long id);
	
}
