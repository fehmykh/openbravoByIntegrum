package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Tender;

public interface TenderRepository extends JpaRepository<Tender, String>{

}
