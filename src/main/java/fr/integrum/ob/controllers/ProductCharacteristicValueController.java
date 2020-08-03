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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.models.ProductCharacteristicValue;
import fr.integrum.ob.repositories.ProductCharacteristicValueRepository;

@RestController
@RequestMapping(value = "/ob")
public class ProductCharacteristicValueController {
	
	private static Logger LOG = LoggerFactory.getLogger(ProductCharacteristicValueController.class);

	@Autowired
	private ProductCharacteristicValueRepository productCharacteristicValueRepository;
	
	@GetMapping("/productCharacteristicValues")
    public Page<ProductCharacteristicValue> getProductCharacteristicValues(Pageable pageable) {
        return productCharacteristicValueRepository.findAll(pageable);
    }
	
	@PostMapping("/productCharacteristicValues")
    public ProductCharacteristicValue createProductCharacteristicValue(@Validated @RequestBody ProductCharacteristicValue productCharacteristicValue) {
		LOG.info("ProductCharacteristicValue created");
        return productCharacteristicValueRepository.save(productCharacteristicValue);
    }

}
