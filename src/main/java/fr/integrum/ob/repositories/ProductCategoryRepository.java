package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{

}
