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

import fr.integrum.ob.models.ProductPrice;
import fr.integrum.ob.repositories.ProductPriceRepository;

@RestController
@RequestMapping(value = "/ob")
public class ProductPriceController {
	
	private static Logger LOG = LoggerFactory.getLogger(ProductPriceController.class);

	@Autowired
	private ProductPriceRepository productPriceRepository;
	
	@GetMapping("/productPrices")
    public Page<ProductPrice> getProductPrices(Pageable pageable) {
        return productPriceRepository.findAll(pageable);
    }
	
	@PostMapping("/productPrices")
    public ProductPrice createProductPrice(@Validated @RequestBody ProductPrice productPrice) {
		LOG.info("ProductPrice created");
        return productPriceRepository.save(productPrice);
    }

}
