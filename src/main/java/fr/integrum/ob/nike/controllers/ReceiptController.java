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

import fr.integrum.ob.nike.repositories.ReceiptRepository;
import fr.integrum.ob.nike.retailmodels.Receipt;

@RestController
public class ReceiptController {
	
	private static Logger LOG = LoggerFactory.getLogger(ReceiptController.class);

	@Autowired
	private ReceiptRepository receiptRepository;
	
	@GetMapping("/receipts")
    public Page<Receipt> getReceipts(Pageable pageable) {
        return receiptRepository.findAll(pageable);
    }
	
	@PostMapping("/receipts")
    public Receipt createReceipt(@Validated @RequestBody Receipt receipt) {
		LOG.info("Receipt created. ");
        return receiptRepository.save(receipt);
    }

}
