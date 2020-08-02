package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.TaxLine;

public interface TaxLineRepository extends JpaRepository<TaxLine, Integer>{

}
