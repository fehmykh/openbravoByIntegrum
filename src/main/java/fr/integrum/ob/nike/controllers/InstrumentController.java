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

import fr.integrum.ob.nike.repositories.InstrumentRepository;
import fr.integrum.ob.nike.retailmodels.Instrument;

@RestController
public class InstrumentController {
	
	private static Logger LOG = LoggerFactory.getLogger(InstrumentController.class);

	@Autowired
	private InstrumentRepository instrumentRepository;
	
	@GetMapping("/instruments")
    public Page<Instrument> getInstruments(Pageable pageable) {
        return instrumentRepository.findAll(pageable);
    }
	
	@PostMapping("/instruments")
    public Instrument createInstrument(@Validated @RequestBody Instrument instrument) {
		LOG.info("Instrument created. ");
        return instrumentRepository.save(instrument);
    }

}
