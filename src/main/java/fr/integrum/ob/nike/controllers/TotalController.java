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

import fr.integrum.ob.nike.repositories.TotalRepository;
import fr.integrum.ob.nike.retailmodels.Total;

@RestController
@RequestMapping(value = "/nk")
public class TotalController {
	
	private static Logger LOG = LoggerFactory.getLogger(TotalController.class);

	@Autowired
	private TotalRepository totalRepository;
	
	@GetMapping("/totals")
    public Page<Total> getTotals(Pageable pageable) {
        return totalRepository.findAll(pageable);
    }
	
	@PostMapping("/totals")
    public Total createTotal(@Validated @RequestBody Total total) {
		LOG.info("Total created. ");
        return totalRepository.save(total);
    }

}
