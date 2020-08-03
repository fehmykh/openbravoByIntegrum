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

import fr.integrum.ob.nike.repositories.StoredValueFundSaleRepository;
import fr.integrum.ob.nike.retailmodels.StoredValueFundSale;

@RestController
@RequestMapping(value = "/nk")
public class StoredValueFundSaleController {
	
	private static Logger LOG = LoggerFactory.getLogger(StoredValueFundSaleController.class);

	@Autowired
	private StoredValueFundSaleRepository storedValueFundSaleRepository;
	
	@GetMapping("/storedValueFundSales")
    public Page<StoredValueFundSale> getStoredValueFundSales(Pageable pageable) {
        return storedValueFundSaleRepository.findAll(pageable);
    }
	
	@PostMapping("/storedValueFundSales")
    public StoredValueFundSale createStoredValueFundSale(@Validated @RequestBody StoredValueFundSale storedValueFundSale) {
		LOG.info("StoredValueFundSale created. ");
        return storedValueFundSaleRepository.save(storedValueFundSale);
    }

}
