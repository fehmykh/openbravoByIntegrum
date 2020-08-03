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

import fr.integrum.ob.models.TaxLineIdentifier;
import fr.integrum.ob.repositories.TaxLineIdentifierRepository;

@RestController
@RequestMapping(value = "/ob")
public class TaxLineIdentifierController {

	private static Logger LOG = LoggerFactory.getLogger(TaxLineIdentifierController.class);

	@Autowired
	private TaxLineIdentifierRepository taxLineIdentifierRepository;

	@GetMapping("/taxLineIdentifiers")
	public Page<TaxLineIdentifier> getTaxLineIdentifiers(Pageable pageable) {
		return taxLineIdentifierRepository.findAll(pageable);
	}

	@PostMapping("/taxLineIdentifiers")
	public TaxLineIdentifier createTaxLineIdentifier(@Validated @RequestBody TaxLineIdentifier taxLineIdentifier) {
		LOG.info("TaxLineIdentifier created. ");
		return taxLineIdentifierRepository.save(taxLineIdentifier);
	}

}
