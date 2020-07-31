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

import fr.integrum.ob.models.Product;
import fr.integrum.ob.repositories.ProductRepository;

@RestController
public class ProductController {
	
	private static Logger LOG = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/products")
    public Page<Product> getProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
	
	@PostMapping("/products")
    public Product createProduct(@Validated @RequestBody Product product) {
		LOG.info("Product created");
        return productRepository.save(product);
    }

}
