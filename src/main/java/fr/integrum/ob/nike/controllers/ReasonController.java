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

import fr.integrum.ob.nike.repositories.ReasonRepository;
import fr.integrum.ob.nike.retailmodels.Reason;

@RestController
@RequestMapping(value = "/nk")
public class ReasonController {
	
	private static Logger LOG = LoggerFactory.getLogger(ReasonController.class);

	@Autowired
	private ReasonRepository reasonRepository;
	
	@GetMapping("/reasons")
    public Page<Reason> getReasons(Pageable pageable) {
        return reasonRepository.findAll(pageable);
    }
	
	@PostMapping("/reasons")
    public Reason createReason(@Validated @RequestBody Reason reason) {
		LOG.info("Reason created. ");
        return reasonRepository.save(reason);
    }

}
