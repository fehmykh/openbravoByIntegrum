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

import fr.integrum.ob.nike.repositories.CreditDebitRepository;
import fr.integrum.ob.nike.retailmodels.CreditDebit;

@RestController
public class CreditDebitController {
	
	private static Logger LOG = LoggerFactory.getLogger(CreditDebitController.class);

	@Autowired
	private CreditDebitRepository creditDebitRepository;
	
	@GetMapping("/creditDebits")
    public Page<CreditDebit> getCreditDebits(Pageable pageable) {
        return creditDebitRepository.findAll(pageable);
    }
	
	@PostMapping("/creditDebits")
    public CreditDebit createCreditDebit(@Validated @RequestBody CreditDebit creditDebit) {
		LOG.info("CreditDebit created. ");
        return creditDebitRepository.save(creditDebit);
    }

}
