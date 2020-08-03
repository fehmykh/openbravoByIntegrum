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

import fr.integrum.ob.models.Organization;
import fr.integrum.ob.repositories.OrganizationRepository;

@RestController
@RequestMapping(value = "/ob")
public class OrganizationController {
	
	private static Logger LOG = LoggerFactory.getLogger(OrganizationController.class);

	@Autowired
	private OrganizationRepository organizationRepository;
	
	@GetMapping("/organizations")
    public Page<Organization> getOrganizations(Pageable pageable) {
        return organizationRepository.findAll(pageable);
    }
	
	@PostMapping("/organizations")
    public Organization createOrganization(@Validated @RequestBody Organization organization) {
		LOG.info("Organization created. ");
        return organizationRepository.save(organization);
    }

}
