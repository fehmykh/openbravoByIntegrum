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

import fr.integrum.ob.models.PriceListVersion;
import fr.integrum.ob.repositories.PriceListVersionRepository;

@RestController
@RequestMapping(value = "/ob")
public class PriceListController {
	
	private static Logger LOG = LoggerFactory.getLogger(PriceListController.class);

	@Autowired
	private PriceListVersionRepository priceListVersionRepository;
	
	@GetMapping("/priceListVersions")
    public Page<PriceListVersion> getPriceListVersions(Pageable pageable) {
        return priceListVersionRepository.findAll(pageable);
    }
	
	@PostMapping("/priceListVersions")
    public PriceListVersion createPriceListVersion(@Validated @RequestBody PriceListVersion priceListVersion) {
		LOG.info("PriceListVersion created");
        return priceListVersionRepository.save(priceListVersion);
    }

}
