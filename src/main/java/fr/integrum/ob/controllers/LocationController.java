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

import fr.integrum.ob.models.UserLocation;
import fr.integrum.ob.repositories.UserLocationRepository;

@RestController
@RequestMapping(value = "/ob")
public class LocationController {

	private static Logger LOG = LoggerFactory.getLogger(LocationController.class);

	@Autowired
	private UserLocationRepository locationRepository;

	@GetMapping("/locations")
	public Page<UserLocation> getLocations(Pageable pageable) {
		return locationRepository.findAll(pageable);
	}

	@PostMapping("/locations")
	public UserLocation createLocation(@Validated @RequestBody UserLocation location) {
		LOG.info("Location created. ");
		return locationRepository.save(location);
	}

}
