package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
