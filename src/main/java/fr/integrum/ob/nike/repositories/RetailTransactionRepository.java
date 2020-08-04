package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.RetailPriceModifier;
import fr.integrum.ob.nike.retailmodels.RetailTransaction;

public interface RetailTransactionRepository extends JpaRepository<RetailTransaction, String>{

}
