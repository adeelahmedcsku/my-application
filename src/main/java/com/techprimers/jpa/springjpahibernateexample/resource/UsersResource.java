package com.techprimers.jpa.springjpahibernateexample.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springjpahibernateexample.model.Users;
import com.techprimers.jpa.springjpahibernateexample.repository.UsersRepository;

@RestController
@RequestMapping("/users")
public class UsersResource {

	@Autowired
	UsersRepository usersRepository;
	
	@GetMapping("/all")
	public List<Users> getAll(){
		
		return usersRepository.findAll();
	}
	
	@GetMapping("/{name}")
	public List<Users> getUser(@PathVariable String firstname){
		
		
		//return usersRepository.findByName(name);
		
		Optional<List<Users>> listOptional=usersRepository.findByfirstname(firstname);
		
		List<Users> users=listOptional.orElse(new ArrayList<>());
		/*if (listOptional.isPresent()) {
			listOptional.get();
		} 		*/
		return users;
	}
	
	
	@GetMapping("/id/{id}")
	public Users getId(@PathVariable("id") final Integer id){
		
		
		return usersRepository.findOne(id);
	}
	
	
	@PostMapping("/createUser")
	public Users createUser(@RequestBody Users users) {
		Users savedUser = usersRepository.save(users);
		return savedUser;
		
	}
	
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Users users, @PathVariable Integer id) {

		Optional<List<Users>> userOptional = usersRepository.findByid(id);

		if (!userOptional.isPresent())
			return ResponseEntity.notFound().build();
		users.setId(id);
		usersRepository.save(users);

		return ResponseEntity.noContent().build();
	}
	
}
