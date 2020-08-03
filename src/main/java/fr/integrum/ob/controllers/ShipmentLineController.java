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

import fr.integrum.ob.models.ShipmentLine;
import fr.integrum.ob.repositories.ShipmentLineRepository;

@RestController
@RequestMapping(value = "/ob")
public class ShipmentLineController {

	private static Logger LOG = LoggerFactory.getLogger(ShipmentLineController.class);

	@Autowired
	private ShipmentLineRepository shipmentLineRepository;

	@GetMapping("/shipmentLines")
	public Page<ShipmentLine> getShipmentLines(Pageable pageable) {
		return shipmentLineRepository.findAll(pageable);
	}

	@PostMapping("/shipmentLines")
	public ShipmentLine createShipmentLine(@Validated @RequestBody ShipmentLine shipmentLine) {
		LOG.info("ShipmentLine created. ");
		return shipmentLineRepository.save(shipmentLine);
	}

}
