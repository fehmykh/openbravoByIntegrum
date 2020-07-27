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

import fr.integrum.ob.models.Assortment;
import fr.integrum.ob.repositories.AssortmentRepository;

@RestController
public class AssortmentController {
	
	private static Logger LOG = LoggerFactory.getLogger(AssortmentController.class);

	@Autowired
	private AssortmentRepository assortmentRepository;
	
	@GetMapping("/assortments")
    public Page<Assortment> getAssortments(Pageable pageable) {
        return assortmentRepository.findAll(pageable);
    }
	
	@PostMapping("/assortments")
    public Assortment createQuestion(@Validated @RequestBody Assortment assortment) {
        return assortmentRepository.save(assortment);
    }

}
