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

import fr.integrum.ob.nike.repositories.BusinessUnitRepository;
import fr.integrum.ob.nike.retailmodels.BusinessUnit;

@RestController
@RequestMapping(value = "/nk")
public class BusinessUnitController {
	
	private static Logger LOG = LoggerFactory.getLogger(BusinessUnitController.class);

	@Autowired
	private BusinessUnitRepository businessUnitRepository;
	
	@GetMapping("/businessUnits")
    public Page<BusinessUnit> getBusinessUnits(Pageable pageable) {
        return businessUnitRepository.findAll(pageable);
    }
	
	@PostMapping("/businessUnits")
    public BusinessUnit createBusinessUnit(@Validated @RequestBody BusinessUnit businessUnit) {
		LOG.info("BusinessUnit created. ");
        return businessUnitRepository.save(businessUnit);
    }

}
