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

import fr.integrum.ob.nike.repositories.AmountRepository;
import fr.integrum.ob.nike.retailmodels.Amount;

@RestController
public class AmountController {
	
	private static Logger LOG = LoggerFactory.getLogger(AmountController.class);

	@Autowired
	private AmountRepository amountRepository;
	
	@GetMapping("/amounts")
    public Page<Amount> getAmounts(Pageable pageable) {
        return amountRepository.findAll(pageable);
    }
	
	@PostMapping("/amounts")
    public Amount createAmount(@Validated @RequestBody Amount amount) {
		LOG.info("Amount created. ");
        return amountRepository.save(amount);
    }

}
