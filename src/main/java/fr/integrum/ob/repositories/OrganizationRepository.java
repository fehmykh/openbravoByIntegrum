package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer>{

}
