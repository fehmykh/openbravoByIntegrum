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

import fr.integrum.ob.nike.repositories.ScanDataRepository;
import fr.integrum.ob.nike.retailmodels.ScanData;

@RestController
public class ScanDataController {
	
	private static Logger LOG = LoggerFactory.getLogger(ScanDataController.class);

	@Autowired
	private ScanDataRepository scanDataRepository;
	
	@GetMapping("/scanData")
    public Page<ScanData> getscanData(Pageable pageable) {
        return scanDataRepository.findAll(pageable);
    }
	
	@PostMapping("/scanData")
    public ScanData createCustomer(@Validated @RequestBody ScanData scanData) {
		LOG.info("Customer created. ");
        return scanDataRepository.save(scanData);
    }

}
