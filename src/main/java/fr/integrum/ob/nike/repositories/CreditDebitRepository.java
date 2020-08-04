package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.CreditDebit;

public interface CreditDebitRepository extends JpaRepository<CreditDebit, String>{

}
