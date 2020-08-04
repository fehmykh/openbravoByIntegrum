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

import fr.integrum.ob.nike.repositories.RetailTransactionRepository;
import fr.integrum.ob.nike.retailmodels.RetailTransaction;

@RestController
@RequestMapping(value = "/nk")
public class RetailTransactionController {
	
	private static Logger LOG = LoggerFactory.getLogger(RetailTransactionController.class);

	@Autowired
	private RetailTransactionRepository retailTransactionRepository;
	
	@GetMapping("/retailTransactions")
    public Page<RetailTransaction> getRetailTransactions(Pageable pageable) {
        return retailTransactionRepository.findAll(pageable);
    }
	
	@PostMapping("/retailTransactions")
    public RetailTransaction createRetailTransaction(@Validated @RequestBody RetailTransaction retailTransaction) {
		LOG.info("RetailTransaction created. ");
        return retailTransactionRepository.save(retailTransaction);
    }

}
