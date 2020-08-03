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

import fr.integrum.ob.nike.repositories.WorkstationRepository;
import fr.integrum.ob.nike.retailmodels.Workstation;

@RestController
public class WorkstationController {
	
	private static Logger LOG = LoggerFactory.getLogger(WorkstationController.class);

	@Autowired
	private WorkstationRepository workstationRepository;
	
	@GetMapping("/workstations")
    public Page<Workstation> getWorkstations(Pageable pageable) {
        return workstationRepository.findAll(pageable);
    }
	
	@PostMapping("/workstations")
    public Workstation createWorkstation(@Validated @RequestBody Workstation workstation) {
		LOG.info("Workstation created. ");
        return workstationRepository.save(workstation);
    }

}
