package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Item;

public interface ItemRepository extends JpaRepository<Item, String>{

}
