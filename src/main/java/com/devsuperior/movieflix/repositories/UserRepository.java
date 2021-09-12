package com.devsuperior.movieflix.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.movieflix.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
	
	@Query("SELECT obj FROM User obj JOIN FETCH obj.roles")
	List<User> findUserRoles();
}
