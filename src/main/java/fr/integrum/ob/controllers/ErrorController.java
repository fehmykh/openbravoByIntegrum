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

import fr.integrum.ob.models.Error;
import fr.integrum.ob.repositories.ErrorRepository;

@RestController
public class ErrorController {
	
	private static Logger LOG = LoggerFactory.getLogger(ErrorController.class);

	@Autowired
	private ErrorRepository errorRepository;
	
	@GetMapping("/errors")
    public Page<Error> getErrors(Pageable pageable) {
        return errorRepository.findAll(pageable);
    }
	
	@PostMapping("/errors")
    public Error createError(@Validated @RequestBody Error error) {
		LOG.info("Error created. ");
        return errorRepository.save(error);
    }

}
