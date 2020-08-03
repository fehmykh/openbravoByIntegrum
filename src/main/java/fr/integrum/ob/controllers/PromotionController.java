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

import fr.integrum.ob.models.Promotion;
import fr.integrum.ob.repositories.PromotionRepository;

@RestController
@RequestMapping(value = "/ob")
public class PromotionController {

	private static Logger LOG = LoggerFactory.getLogger(PromotionController.class);

	@Autowired
	private PromotionRepository promotionRepository;

	@GetMapping("/promotions")
	public Page<Promotion> getPromotions(Pageable pageable) {
		return promotionRepository.findAll(pageable);
	}

	@PostMapping("/promotions")
	public Promotion createPromotion(@Validated @RequestBody Promotion promotion) {
		LOG.info("Promotion created. ");
		return promotionRepository.save(promotion);
	}

}
