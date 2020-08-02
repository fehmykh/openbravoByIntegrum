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

import fr.integrum.ob.models.Line;
import fr.integrum.ob.repositories.LineRepository;

@RestController
public class LineController {
	
	private static Logger LOG = LoggerFactory.getLogger(LineController.class);

	@Autowired
	private LineRepository lineRepository;
	
	@GetMapping("/lines")
    public Page<Line> getLines(Pageable pageable) {
        return lineRepository.findAll(pageable);
    }
	
	@PostMapping("/lines")
    public Line createLine(@Validated @RequestBody Line line) {
		LOG.info("Line created. ");
        return lineRepository.save(line);
    }

}
