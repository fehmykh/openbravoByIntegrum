package fr.integrum.ob.models;

public class Assortment {

	private Long assortmentId;
	private String client;
	private String organization;
	private String name;
	private String description;
	private Boolean active;

	public Assortment() {
		super();
	}

	public Assortment(Long assortmentId, String client, String organization, String name, String description,
			Boolean active) {
		super();
		this.assortmentId = assortmentId;
		this.client = client;
		this.organization = organization;
		this.name = name;
		this.description = description;
		this.active = active;
	}

	public Long getAssortmentId() {
		return assortmentId;
	}

	public void setAssortmentId(Long assortmentId) {
		this.assortmentId = assortmentId;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
