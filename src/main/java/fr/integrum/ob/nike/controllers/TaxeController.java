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

import fr.integrum.ob.nike.repositories.TaxeRepository;
import fr.integrum.ob.nike.retailmodels.Taxe;

@RestController
@RequestMapping(value = "/nk")
public class TaxeController {
	
	private static Logger LOG = LoggerFactory.getLogger(TaxeController.class);

	@Autowired
	private TaxeRepository taxeRepository;
	
	@GetMapping("/taxes")
    public Page<Taxe> getTaxes(Pageable pageable) {
        return taxeRepository.findAll(pageable);
    }
	
	@PostMapping("/taxes")
    public Taxe createTaxe(@Validated @RequestBody Taxe taxe) {
		LOG.info("Taxe created. ");
        return taxeRepository.save(taxe);
    }

}
