package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.TaxLineIdentifier;

public interface TaxLineIdentifierRepository extends JpaRepository<TaxLineIdentifier, Integer>{

}
