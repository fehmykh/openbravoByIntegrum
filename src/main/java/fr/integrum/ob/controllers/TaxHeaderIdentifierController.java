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

import fr.integrum.ob.models.TaxHeaderIdentifier;
import fr.integrum.ob.repositories.TaxHeaderIdentifierRepository;

@RestController
@RequestMapping(value = "/ob")
public class TaxHeaderIdentifierController {

	private static Logger LOG = LoggerFactory.getLogger(TaxHeaderIdentifierController.class);

	@Autowired
	private TaxHeaderIdentifierRepository taxHeaderIdentifierRepository;

	@GetMapping("/taxHeaderIdentifiers")
	public Page<TaxHeaderIdentifier> getTaxHeaderIdentifiers(Pageable pageable) {
		return taxHeaderIdentifierRepository.findAll(pageable);
	}

	@PostMapping("/taxHeaderIdentifiers")
	public TaxHeaderIdentifier createTaxHeaderIdentifier(@Validated @RequestBody TaxHeaderIdentifier taxHeaderIdentifier) {
		LOG.info("TaxHeaderIdentifier created. ");
		return taxHeaderIdentifierRepository.save(taxHeaderIdentifier);
	}

}
