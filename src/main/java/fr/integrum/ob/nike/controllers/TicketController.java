package fr.integrum.ob.nike.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.nike.repositories.TicketRepository;
import fr.integrum.ob.nike.retailmodels.Ticket;

@RestController
public class TicketController {
	
	private static Logger LOG = LoggerFactory.getLogger(TicketController.class);

	@Autowired
	private TicketRepository ticketRepository;
	
	@GetMapping("/tickets")
    public Page<Ticket> getTickets(Pageable pageable) {
        return ticketRepository.findAll(pageable);
    }
	
	@PostMapping("/tickets")
    public Ticket createTicket(@Validated @RequestBody Ticket ticket) {
		LOG.info("Ticket created. ");
        return ticketRepository.save(ticket);
    }

}
