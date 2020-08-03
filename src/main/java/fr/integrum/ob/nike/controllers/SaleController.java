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

import fr.integrum.ob.nike.repositories.SaleRepository;
import fr.integrum.ob.nike.retailmodels.Sale;

@RestController
public class SaleController {
	
	private static Logger LOG = LoggerFactory.getLogger(SaleController.class);

	@Autowired
	private SaleRepository saleRepository;
	
	@GetMapping("/sales")
    public Page<Sale> getSales(Pageable pageable) {
        return saleRepository.findAll(pageable);
    }
	
	@PostMapping("/sales")
    public Sale createSale(@Validated @RequestBody Sale sale) {
		LOG.info("Sale created. ");
        return saleRepository.save(sale);
    }

}
