package fr.integrum.ob.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="greetings")
public class Greetings {

	@Id
	@Column(name="greeting_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer greetingId;
	@Column
	private String name;
	@Column
	private String title;
	@Column(name="business_partner_id")
	private Integer businessPartnerId;
	public Greetings() {
		super();
	}
	
	
}
