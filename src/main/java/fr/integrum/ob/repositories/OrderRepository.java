package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
