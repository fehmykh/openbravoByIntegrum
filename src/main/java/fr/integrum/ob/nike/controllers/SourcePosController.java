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

import fr.integrum.ob.nike.repositories.SourcePosRepository;
import fr.integrum.ob.nike.retailmodels.SourcePos;

@RestController
@RequestMapping(value = "/nk")
public class SourcePosController {
	
	private static Logger LOG = LoggerFactory.getLogger(SourcePosController.class);

	@Autowired
	private SourcePosRepository sourcePosRepository;
	
	@GetMapping("/sourcesPos")
    public Page<SourcePos> getSourcesPos(Pageable pageable) {
        return sourcePosRepository.findAll(pageable);
    }
	
	@PostMapping("/sourcesPos")
    public SourcePos createSourcePos(@Validated @RequestBody SourcePos sourcePos) {
		LOG.info("SourcePos created. ");
        return sourcePosRepository.save(sourcePos);
    }

}
