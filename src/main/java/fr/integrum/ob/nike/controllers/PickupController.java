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

import fr.integrum.ob.nike.repositories.PickupRepository;
import fr.integrum.ob.nike.retailmodels.Pickup;

@RestController
public class PickupController {
	
	private static Logger LOG = LoggerFactory.getLogger(PickupController.class);

	@Autowired
	private PickupRepository pickupRepository;
	
	@GetMapping("/pickups")
    public Page<Pickup> getPickups(Pageable pageable) {
        return pickupRepository.findAll(pageable);
    }
	
	@PostMapping("/pickups")
    public Pickup createPickup(@Validated @RequestBody Pickup pickup) {
		LOG.info("Pickup created. ");
        return pickupRepository.save(pickup);
    }

}
