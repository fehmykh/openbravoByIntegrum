package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
