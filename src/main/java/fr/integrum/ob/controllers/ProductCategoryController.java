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

import fr.integrum.ob.models.ProductCategory;
import fr.integrum.ob.repositories.ProductCategoryRepository;

@RestController
@RequestMapping(value = "/ob")
public class ProductCategoryController {
	
	private static Logger LOG = LoggerFactory.getLogger(ProductCategoryController.class);

	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	@GetMapping("/productCategories")
    public Page<ProductCategory> getProductCategories(Pageable pageable) {
        return productCategoryRepository.findAll(pageable);
    }
	
	@PostMapping("/productCategories")
    public ProductCategory createProductCategory(@Validated @RequestBody ProductCategory productCategory) {
		LOG.info("ProductCategory created");
        return productCategoryRepository.save(productCategory);
    }

}
