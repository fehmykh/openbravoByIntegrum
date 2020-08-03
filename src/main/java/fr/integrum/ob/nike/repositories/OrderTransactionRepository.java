package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.OrderTransaction;

public interface OrderTransactionRepository extends JpaRepository<OrderTransaction, Integer>{

}
