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
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.models.Greetings;
import fr.integrum.ob.repositories.GreetingsRepository;

@RestController
public class GreetingsController {

	private static Logger LOG = LoggerFactory.getLogger(GreetingsController.class);

	@Autowired
	private GreetingsRepository greetingsRepository;

	@GetMapping("/greetings")
	public Page<Greetings> getGreetings(Pageable pageable) {
		return greetingsRepository.findAll(pageable);
	}

	@PostMapping("/greetings")
	public Greetings createGreetings(@Validated @RequestBody Greetings greetings) {
		LOG.info("Greetings created. ");
		return greetingsRepository.save(greetings);
	}

}
