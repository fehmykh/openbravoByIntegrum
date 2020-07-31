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
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.models.PriceList;
import fr.integrum.ob.repositories.PriceListRepository;

@RestController
public class PriceListVersionController {
	
	private static Logger LOG = LoggerFactory.getLogger(PriceListVersionController.class);

	@Autowired
	private PriceListRepository priceListRepository;
	
	@GetMapping("/priceLists")
    public Page<PriceList> getPriceLists(Pageable pageable) {
        return priceListRepository.findAll(pageable);
    }
	
	@PostMapping("/priceLists")
    public PriceList createPriceList(@Validated @RequestBody PriceList priceList) {
		LOG.info("PriceList created");
        return priceListRepository.save(priceList);
    }

}
