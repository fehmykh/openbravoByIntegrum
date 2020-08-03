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

import fr.integrum.ob.nike.repositories.QuantityRepository;
import fr.integrum.ob.nike.retailmodels.Quantity;

@RestController
public class QuantityController {
	
	private static Logger LOG = LoggerFactory.getLogger(QuantityController.class);

	@Autowired
	private QuantityRepository quantityRepository;
	
	@GetMapping("/quantities")
    public Page<Quantity> getQuantities(Pageable pageable) {
        return quantityRepository.findAll(pageable);
    }
	
	@PostMapping("/quantities")
    public Quantity createQuantity(@Validated @RequestBody Quantity quantity) {
		LOG.info("Quantity created. ");
        return quantityRepository.save(quantity);
    }

}
