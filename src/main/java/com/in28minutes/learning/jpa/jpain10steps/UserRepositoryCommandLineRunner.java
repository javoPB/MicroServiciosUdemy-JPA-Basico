package com.in28minutes.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	UserRepository userRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Néstor", "Administrador");
		
		//Este método sirve para insertar y para actualizar. (Si el registro no tiene asignado un ID se inserta, si tiene un ID se actualiza)
		userRepository.save(user);
		
		//Este método sirve para obtener la información por ID.
		Optional<User> userOne = userRepository.findById(1L);
		
		//Este método sirve para obtener la información de todos los user.
		List<User> users = userRepository.findAll();

		log.info("(JpaRepository) --> El nuevo user generado: " + user);
	}

}
