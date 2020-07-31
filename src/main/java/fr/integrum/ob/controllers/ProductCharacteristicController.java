package fr.integrum.ob.controllers;

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

import fr.integrum.ob.models.ProductCharacteristic;
import fr.integrum.ob.repositories.ProductCharacteristicRepository;

@RestController
public class ProductCharacteristicController {
	
	private static Logger LOG = LoggerFactory.getLogger(ProductCharacteristicController.class);

	@Autowired
	private ProductCharacteristicRepository productCharacteristicRepository;
	
	@GetMapping("/productCharacteristics")
    public Page<ProductCharacteristic> getProductCharacteristics(Pageable pageable) {
        return productCharacteristicRepository.findAll(pageable);
    }
	
	@PostMapping("/productCharacteristics")
    public ProductCharacteristic createProductCharacteristic(@Validated @RequestBody ProductCharacteristic productCharacteristic) {
		LOG.info("ProductCharacteristic created");
        return productCharacteristicRepository.save(productCharacteristic);
    }

}
