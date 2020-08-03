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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.models.Payment;
import fr.integrum.ob.repositories.PaymentRepository;

@RestController
@RequestMapping(value = "/ob")
public class PaymentController {

	private static Logger LOG = LoggerFactory.getLogger(PaymentController.class);

	@Autowired
	private PaymentRepository paymentRepository;

	@GetMapping("/payments")
	public Page<Payment> getPayments(Pageable pageable) {
		return paymentRepository.findAll(pageable);
	}

	@PostMapping("/payments")
	public Payment createPayment(@Validated @RequestBody Payment payment) {
		LOG.info("Payment created. ");
		return paymentRepository.save(payment);
	}

}
