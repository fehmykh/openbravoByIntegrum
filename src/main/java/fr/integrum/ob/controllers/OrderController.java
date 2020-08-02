package fr.integrum.ob.controllers;

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

import fr.integrum.ob.models.Order;
import fr.integrum.ob.repositories.OrderRepository;

@RestController
public class OrderController {

	private static Logger LOG = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	private OrderRepository orderRepository;

	@GetMapping("/orders")
	public Page<Order> getOrders(Pageable pageable) {
		return orderRepository.findAll(pageable);
	}

	@PostMapping("/orders")
	public Order createOrder(@Validated @RequestBody Order order) {
		LOG.info("Order created. ");
		return orderRepository.save(order);
	}

}
