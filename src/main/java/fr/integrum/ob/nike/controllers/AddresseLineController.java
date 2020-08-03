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

import fr.integrum.ob.nike.repositories.AddresseLineRepository;
import fr.integrum.ob.nike.retailmodels.AddresseLine;

@RestController
public class AddresseLineController {
	
	private static Logger LOG = LoggerFactory.getLogger(AddresseLineController.class);

	@Autowired
	private AddresseLineRepository addresseLineRepository;
	
	@GetMapping("/addresseLines")
    public Page<AddresseLine> getAddresseLines(Pageable pageable) {
        return addresseLineRepository.findAll(pageable);
    }
	
	@PostMapping("/addresseLines")
    public AddresseLine createAddresseLine(@Validated @RequestBody AddresseLine addresseLine) {
		LOG.info("AddresseLine created. ");
        return addresseLineRepository.save(addresseLine);
    }

}
