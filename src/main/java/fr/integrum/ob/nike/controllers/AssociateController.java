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
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.nike.repositories.AssociateRepository;
import fr.integrum.ob.nike.retailmodels.Associate;

@RestController
public class AssociateController {
	
	private static Logger LOG = LoggerFactory.getLogger(AssociateController.class);

	@Autowired
	private AssociateRepository associateRepository;
	
	@GetMapping("/associates")
    public Page<Associate> getAssociates(Pageable pageable) {
        return associateRepository.findAll(pageable);
    }
	
	@PostMapping("/associates")
    public Associate createAssociate(@Validated @RequestBody Associate associate) {
		LOG.info("Associate created. ");
        return associateRepository.save(associate);
    }

}
