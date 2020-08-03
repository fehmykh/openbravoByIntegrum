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

import fr.integrum.ob.nike.repositories.DisposalRepository;
import fr.integrum.ob.nike.retailmodels.Disposal;

@RestController
public class DisposalController {
	
	private static Logger LOG = LoggerFactory.getLogger(DisposalController.class);

	@Autowired
	private DisposalRepository disposalRepository;
	
	@GetMapping("/disposals")
    public Page<Disposal> getDisposals(Pageable pageable) {
        return disposalRepository.findAll(pageable);
    }
	
	@PostMapping("/disposals")
    public Disposal createDisposal(@Validated @RequestBody Disposal disposal) {
		LOG.info("Disposal created. ");
        return disposalRepository.save(disposal);
    }

}
