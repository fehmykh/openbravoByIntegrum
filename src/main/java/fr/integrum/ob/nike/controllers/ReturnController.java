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
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.nike.repositories.ReturnRepository;
import fr.integrum.ob.nike.retailmodels.Return;

@RestController
public class ReturnController {
	
	private static Logger LOG = LoggerFactory.getLogger(ReturnController.class);

	@Autowired
	private ReturnRepository returnRepository;
	
	@GetMapping("/returns")
    public Page<Return> getReturns(Pageable pageable) {
        return returnRepository.findAll(pageable);
    }
	
	@PostMapping("/returns")
    public Return createReturn(@Validated @RequestBody Return returnItem) {
		LOG.info("Return created. ");
        return returnRepository.save(returnItem);
    }

}
