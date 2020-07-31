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

import fr.integrum.ob.models.Assortment;
import fr.integrum.ob.models.ProductsAssortment;
import fr.integrum.ob.repositories.ProductsAssortmentRepository;

@RestController
public class ProductsAssortmentController {
	
	private static Logger LOG = LoggerFactory.getLogger(ProductsAssortmentController.class);

	@Autowired
	private ProductsAssortmentRepository productsAssortmentRepository;
	
	@GetMapping("/productsAssortments")
    public Page<ProductsAssortment> getAssortments(Pageable pageable) {
        return productsAssortmentRepository.findAll(pageable);
    }
	
	@PostMapping("/productsAssortments")
    public ProductsAssortment createProductsAssortment(@Validated @RequestBody ProductsAssortment productsAssortment) {
        return productsAssortmentRepository.save(productsAssortment);
    }

}
