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

import fr.integrum.ob.nike.repositories.SaleForDeliveryRepository;
import fr.integrum.ob.nike.retailmodels.SaleForDelivery;

@RestController
@RequestMapping(value = "/nk")
public class SaleForDeliveryController {
	
	private static Logger LOG = LoggerFactory.getLogger(SaleForDeliveryController.class);

	@Autowired
	private SaleForDeliveryRepository saleForDeliveryRepository;
	
	@GetMapping("/salesForDelivery")
    public Page<SaleForDelivery> getSalesForDelivery(Pageable pageable) {
        return saleForDeliveryRepository.findAll(pageable);
    }
	
	@PostMapping("/salesForDelivery")
    public SaleForDelivery createSaleForDelivery(@Validated @RequestBody SaleForDelivery saleForDelivery) {
		LOG.info("SaleForDelivery created. ");
        return saleForDeliveryRepository.save(saleForDelivery);
    }

}
