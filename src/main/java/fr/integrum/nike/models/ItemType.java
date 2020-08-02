package fr.integrum.nike.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NK_ItemTypes")
public class ItemType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_type_id")
	private Integer itemTypeId;

	@Column(name = "type")
	private String type;
}
