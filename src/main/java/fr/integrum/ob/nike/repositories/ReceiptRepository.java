package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Receipt;

public interface ReceiptRepository extends JpaRepository<Receipt, Integer>{

}
