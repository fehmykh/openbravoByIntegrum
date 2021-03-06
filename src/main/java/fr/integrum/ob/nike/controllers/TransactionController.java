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

import fr.integrum.ob.nike.repositories.TransactionRepository;
import fr.integrum.ob.nike.retailmodels.Transaction;

@RestController
@RequestMapping(value = "/nk")
public class TransactionController {
	
	private static Logger LOG = LoggerFactory.getLogger(TransactionController.class);

	@Autowired
	private TransactionRepository transactionRepository;
	
	@GetMapping("/transactions")
    public Page<Transaction> getTransactions(Pageable pageable) {
        return transactionRepository.findAll(pageable);
    }
	
	@PostMapping("/transactions")
    public Transaction createTransaction(@Validated @RequestBody Transaction transaction) {
		LOG.info("Transaction created. ");
        return transactionRepository.save(transaction);
    }

}
