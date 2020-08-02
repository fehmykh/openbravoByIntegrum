package fr.integrum.nike.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_Tickets")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EventID")
	private Integer eventID;
	@Column(name="EventName")
	private String eventName;
	@Column(name="EventDateTime")
	private Date eventDateTime;

}
