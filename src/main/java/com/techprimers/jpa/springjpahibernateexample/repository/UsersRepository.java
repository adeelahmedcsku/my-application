package com.techprimers.jpa.springjpahibernateexample.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.techprimers.jpa.springjpahibernateexample.model.Users;

public interface UsersRepository extends JpaRepository<Users,Integer>{

	Optional<List<Users>> findByfirstname(String firstname);
	Optional<List<Users>> findByid(Integer id);
	
	 Users findByusername(String username);
	
}
