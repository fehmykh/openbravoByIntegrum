package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, String>{

}
