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

import fr.integrum.ob.models.BusinessPartner;
import fr.integrum.ob.repositories.BusinessPartnerRepository;

@RestController
@RequestMapping(value = "/ob")
public class BusinessPartnerController {

	private static Logger LOG = LoggerFactory.getLogger(BusinessPartnerController.class);

	@Autowired
	private BusinessPartnerRepository businessPartnerRepository;

	@GetMapping("/businessPartners")
	public Page<BusinessPartner> getBusinessPartners(Pageable pageable) {
		return businessPartnerRepository.findAll(pageable);
	}

	@PostMapping("/businessPartners")
	public BusinessPartner createBusinessPartner(@Validated @RequestBody BusinessPartner businessPartner) {
		LOG.info("Business Partner created. ");
		return businessPartnerRepository.save(businessPartner);
	}

}
