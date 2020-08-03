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

import fr.integrum.ob.nike.repositories.TenderRepository;
import fr.integrum.ob.nike.retailmodels.Tender;

@RestController
public class TenderController {
	
	private static Logger LOG = LoggerFactory.getLogger(TenderController.class);

	@Autowired
	private TenderRepository tenderRepository;
	
	@GetMapping("/tenders")
    public Page<Tender> getTenders(Pageable pageable) {
        return tenderRepository.findAll(pageable);
    }
	
	@PostMapping("/tenders")
    public Tender createTender(@Validated @RequestBody Tender tender) {
		LOG.info("Tender created. ");
        return tenderRepository.save(tender);
    }

}
