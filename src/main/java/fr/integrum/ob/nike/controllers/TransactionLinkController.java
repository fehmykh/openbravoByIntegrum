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

import fr.integrum.ob.nike.repositories.TransactionLinkRepository;
import fr.integrum.ob.nike.retailmodels.TransactionLink;

@RestController
@RequestMapping(value = "/nk")
public class TransactionLinkController {
	
	private static Logger LOG = LoggerFactory.getLogger(TransactionLinkController.class);

	@Autowired
	private TransactionLinkRepository transactionLinkRepository;
	
	@GetMapping("/transactionLinks")
    public Page<TransactionLink> getTransactionLinks(Pageable pageable) {
        return transactionLinkRepository.findAll(pageable);
    }
	
	@PostMapping("/transactionLinks")
    public TransactionLink createTransactionLink(@Validated @RequestBody TransactionLink transactionLink) {
		LOG.info("TransactionLink created. ");
        return transactionLinkRepository.save(transactionLink);
    }

}
