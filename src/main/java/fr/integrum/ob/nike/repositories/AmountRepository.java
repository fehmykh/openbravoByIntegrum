package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Amount;

public interface AmountRepository extends JpaRepository<Amount, Integer>{

}
