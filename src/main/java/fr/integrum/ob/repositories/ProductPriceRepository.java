package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.Product;
import fr.integrum.ob.models.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Integer>{

}
