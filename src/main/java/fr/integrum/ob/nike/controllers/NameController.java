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

import fr.integrum.ob.nike.repositories.NameRepository;
import fr.integrum.ob.nike.retailmodels.Name;

@RestController
@RequestMapping(value = "/nk")
public class NameController {
	
	private static Logger LOG = LoggerFactory.getLogger(NameController.class);

	@Autowired
	private NameRepository nameRepository;
	
	@GetMapping("/names")
    public Page<Name> getNames(Pageable pageable) {
        return nameRepository.findAll(pageable);
    }
	
	@PostMapping("/names")
    public Name createName(@Validated @RequestBody Name name) {
		LOG.info("Name created. ");
        return nameRepository.save(name);
    }

}
