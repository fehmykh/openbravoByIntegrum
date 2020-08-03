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

import fr.integrum.ob.nike.repositories.SurveyRepository;
import fr.integrum.ob.nike.retailmodels.Survey;

@RestController
@RequestMapping(value = "/nk")
public class SurveyController {
	
	private static Logger LOG = LoggerFactory.getLogger(SurveyController.class);

	@Autowired
	private SurveyRepository surveyRepository;
	
	@GetMapping("/surveys")
    public Page<Survey> getSurveys(Pageable pageable) {
        return surveyRepository.findAll(pageable);
    }
	
	@PostMapping("/surveys")
    public Survey createSurvey(@Validated @RequestBody Survey survey) {
		LOG.info("Survey created. ");
        return surveyRepository.save(survey);
    }

}
