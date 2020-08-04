package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String>{

}
