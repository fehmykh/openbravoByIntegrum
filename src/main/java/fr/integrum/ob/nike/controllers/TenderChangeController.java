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

import fr.integrum.ob.nike.repositories.TenderChangeRepository;
import fr.integrum.ob.nike.retailmodels.TenderChange;

@RestController
public class TenderChangeController {
	
	private static Logger LOG = LoggerFactory.getLogger(TenderChangeController.class);

	@Autowired
	private TenderChangeRepository tenderChangeRepository;
	
	@GetMapping("/tenderChanges")
    public Page<TenderChange> getTenderChanges(Pageable pageable) {
        return tenderChangeRepository.findAll(pageable);
    }
	
	@PostMapping("/tenderChanges")
    public TenderChange createTenderChange(@Validated @RequestBody TenderChange tenderChange) {
		LOG.info("TenderChange created. ");
        return tenderChangeRepository.save(tenderChange);
    }

}
