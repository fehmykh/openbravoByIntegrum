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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.nike.repositories.OrderTransactionRepository;
import fr.integrum.ob.nike.retailmodels.OrderTransaction;

@RestController
@RequestMapping(value = "/nk")
public class OrderTransactionController {
	
	private static Logger LOG = LoggerFactory.getLogger(OrderTransactionController.class);

	@Autowired
	private OrderTransactionRepository orderTransactionRepository;
	
	@GetMapping("/orderTransactions")
    public Page<OrderTransaction> getOrderTransactions(Pageable pageable) {
        return orderTransactionRepository.findAll(pageable);
    }
	
	@PostMapping("/orderTransactions")
    public OrderTransaction createOrderTransaction(@Validated @RequestBody OrderTransaction orderTransaction) {
		LOG.info("OrderTransaction created. ");
        return orderTransactionRepository.save(orderTransaction);
    }

}
