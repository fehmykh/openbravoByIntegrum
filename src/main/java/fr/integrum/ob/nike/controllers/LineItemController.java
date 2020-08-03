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

import fr.integrum.ob.nike.repositories.LineItemRepository;
import fr.integrum.ob.nike.retailmodels.LineItem;

@RestController
public class LineItemController {
	
	private static Logger LOG = LoggerFactory.getLogger(LineItemController.class);

	@Autowired
	private LineItemRepository lineItemRepository;
	
	@GetMapping("/lineItems")
    public Page<LineItem> getLineItems(Pageable pageable) {
        return lineItemRepository.findAll(pageable);
    }
	
	@PostMapping("/lineItems")
    public LineItem createLineItem(@Validated @RequestBody LineItem lineItem) {
		LOG.info("LineItem created. ");
        return lineItemRepository.save(lineItem);
    }

}
