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

import fr.integrum.ob.nike.repositories.CustomerRepository;
import fr.integrum.ob.nike.retailmodels.Customer;

@RestController
public class CustomerController {
	
	private static Logger LOG = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customers")
    public Page<Customer> getCustomers(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }
	
	@PostMapping("/customers")
    public Customer createCustomer(@Validated @RequestBody Customer customer) {
		LOG.info("Customer created. ");
        return customerRepository.save(customer);
    }

}
