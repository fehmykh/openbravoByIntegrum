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

import fr.integrum.ob.nike.repositories.ComplimentaryTenderRepository;
import fr.integrum.ob.nike.retailmodels.ComplimentaryTender;

@RestController
@RequestMapping(value = "/nk")
public class ComplimentaryTenderController {
	
	private static Logger LOG = LoggerFactory.getLogger(ComplimentaryTenderController.class);

	@Autowired
	private ComplimentaryTenderRepository complimentaryTenderRepository;
	
	@GetMapping("/complimentaryTenders")
    public Page<ComplimentaryTender> getComplimentaryTenders(Pageable pageable) {
        return complimentaryTenderRepository.findAll(pageable);
    }
	
	@PostMapping("/complimentaryTenders")
    public ComplimentaryTender createComplimentaryTender(@Validated @RequestBody ComplimentaryTender complimentaryTender) {
		LOG.info("ComplimentaryTender created. ");
        return complimentaryTenderRepository.save(complimentaryTender);
    }

}
