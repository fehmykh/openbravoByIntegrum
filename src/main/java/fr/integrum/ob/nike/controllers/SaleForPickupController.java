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

import fr.integrum.ob.nike.repositories.SaleForPickupRepository;
import fr.integrum.ob.nike.retailmodels.SaleForPickup;

@RestController
@RequestMapping(value = "/nk")
public class SaleForPickupController {
	
	private static Logger LOG = LoggerFactory.getLogger(SaleForPickupController.class);

	@Autowired
	private SaleForPickupRepository saleForPickupRepository;
	
	@GetMapping("/salesForPickup")
    public Page<SaleForPickup> getSalesForPickup(Pageable pageable) {
        return saleForPickupRepository.findAll(pageable);
    }
	
	@PostMapping("/salesForPickup")
    public SaleForPickup createSaleForPickup(@Validated @RequestBody SaleForPickup saleForPickup) {
		LOG.info("SaleForPickup created. ");
        return saleForPickupRepository.save(saleForPickup);
    }

}
