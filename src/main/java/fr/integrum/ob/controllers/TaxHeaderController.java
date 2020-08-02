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

import fr.integrum.ob.models.TaxHeader;
import fr.integrum.ob.repositories.TaxHeaderRepository;

@RestController
public class TaxHeaderController {

	private static Logger LOG = LoggerFactory.getLogger(TaxHeaderController.class);

	@Autowired
	private TaxHeaderRepository taxHeaderRepository;

	@GetMapping("/taxHeaders")
	public Page<TaxHeader> getTaxHeaders(Pageable pageable) {
		return taxHeaderRepository.findAll(pageable);
	}

	@PostMapping("/taxHeaders")
	public TaxHeader createTaxHeader(@Validated @RequestBody TaxHeader taxHeader) {
		LOG.info("TaxHeader created. ");
		return taxHeaderRepository.save(taxHeader);
	}

}
