package fr.integrum.ob.nike.controllers;

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

import fr.integrum.ob.nike.repositories.DescriptionRepository;
import fr.integrum.ob.nike.retailmodels.Description;

@RestController
@RequestMapping(value = "/nk")
public class DescriptionController {

	private static Logger LOG = LoggerFactory.getLogger(DescriptionController.class);

	@Autowired
	private DescriptionRepository descriptionRepository;

	@GetMapping("/descriptions")
	public Page<Description> getDescriptions(Pageable pageable) {
		return descriptionRepository.findAll(pageable);
	}

	@PostMapping("/descriptions")
	public Description createDescription(@Validated @RequestBody Description description) {
		LOG.info("Description created. ");
		return descriptionRepository.save(description);
	}

}
