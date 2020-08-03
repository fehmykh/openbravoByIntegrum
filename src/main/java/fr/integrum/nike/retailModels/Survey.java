package fr.integrum.nike.retailModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NK_Surveys")
public class Survey {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SurveyID")
	private Integer surveyId;
	
	@Column(name = "SurveyCode")
	private String surveyCode;
}
