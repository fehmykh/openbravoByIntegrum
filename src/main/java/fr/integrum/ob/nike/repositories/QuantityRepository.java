package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Quantity;

public interface QuantityRepository extends JpaRepository<Quantity, Integer>{

}
