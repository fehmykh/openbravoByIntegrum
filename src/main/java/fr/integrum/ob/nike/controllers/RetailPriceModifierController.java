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

import fr.integrum.ob.nike.repositories.RetailPriceModifierRepository;
import fr.integrum.ob.nike.retailmodels.RetailPriceModifier;

@RestController
@RequestMapping(value = "/nk")
public class RetailPriceModifierController {
	
	private static Logger LOG = LoggerFactory.getLogger(RetailPriceModifierController.class);

	@Autowired
	private RetailPriceModifierRepository retailPriceModifierRepository;
	
	@GetMapping("/retailPriceModifiers")
    public Page<RetailPriceModifier> getRetailPriceModifiers(Pageable pageable) {
        return retailPriceModifierRepository.findAll(pageable);
    }
	
	@PostMapping("/retailPriceModifiers")
    public RetailPriceModifier createRetailPriceModifier(@Validated @RequestBody RetailPriceModifier retailPriceModifier) {
		LOG.info("RetailPriceModifier created. ");
        return retailPriceModifierRepository.save(retailPriceModifier);
    }

}
