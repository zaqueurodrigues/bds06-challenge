package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entites.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
}
