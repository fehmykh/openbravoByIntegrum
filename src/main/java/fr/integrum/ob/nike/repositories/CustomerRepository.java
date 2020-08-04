package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
