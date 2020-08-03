package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.TransactionLink;

public interface TransactionLinkRepository extends JpaRepository<TransactionLink, Integer>{

}
