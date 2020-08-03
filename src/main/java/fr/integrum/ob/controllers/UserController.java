package fr.integrum.ob.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.models.User;
import fr.integrum.ob.repositories.UserRepository;

@RestController
@RequestMapping(value = "/ob")
public class UserController {

	private static Logger LOG = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public Page<User> getUsers(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@PostMapping("/users")
	public User createUser(@Validated @RequestBody User user) {
		LOG.info("User created. ");
		return userRepository.save(user);
	}

}
