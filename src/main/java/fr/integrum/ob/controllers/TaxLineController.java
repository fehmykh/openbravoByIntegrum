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

import fr.integrum.ob.models.TaxLine;
import fr.integrum.ob.repositories.TaxLineRepository;

@RestController
public class TaxLineController {

	private static Logger LOG = LoggerFactory.getLogger(TaxLineController.class);

	@Autowired
	private TaxLineRepository taxLineRepository;

	@GetMapping("/taxLines")
	public Page<TaxLine> getTaxLines(Pageable pageable) {
		return taxLineRepository.findAll(pageable);
	}

	@PostMapping("/taxLines")
	public TaxLine createTaxLine(@Validated @RequestBody TaxLine taxLine) {
		LOG.info("TaxLine created. ");
		return taxLineRepository.save(taxLine);
	}

}
