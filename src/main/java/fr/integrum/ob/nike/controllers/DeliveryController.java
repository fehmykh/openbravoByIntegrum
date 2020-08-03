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

import fr.integrum.ob.nike.repositories.DeliveryRepository;
import fr.integrum.ob.nike.retailmodels.Delivery;

@RestController
@RequestMapping(value = "/nk")
public class DeliveryController {
	
	private static Logger LOG = LoggerFactory.getLogger(DeliveryController.class);

	@Autowired
	private DeliveryRepository deliveryRepository;
	
	@GetMapping("/deliveries")
    public Page<Delivery> getDeliveries(Pageable pageable) {
        return deliveryRepository.findAll(pageable);
    }
	
	@PostMapping("/deliveries")
    public Delivery createDelivery(@Validated @RequestBody Delivery delivery) {
		LOG.info("Delivery created. ");
        return deliveryRepository.save(delivery);
    }

}
