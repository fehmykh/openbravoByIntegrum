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

import fr.integrum.ob.nike.repositories.AddresseRepository;
import fr.integrum.ob.nike.retailmodels.Addresse;

@RestController
@RequestMapping(value = "/nk")
public class AddresseController {
	
	private static Logger LOG = LoggerFactory.getLogger(AddresseController.class);

	@Autowired
	private AddresseRepository addresseRepository;
	
	@GetMapping("/addresses")
    public Page<Addresse> getAddresses(Pageable pageable) {
        return addresseRepository.findAll(pageable);
    }
	
	@PostMapping("/addresses")
    public Addresse createAddresse(@Validated @RequestBody Addresse addresse) {
		LOG.info("Addresse created. ");
        return addresseRepository.save(addresse);
    }

}
