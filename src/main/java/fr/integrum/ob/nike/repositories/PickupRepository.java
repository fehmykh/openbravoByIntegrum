package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Pickup;

public interface PickupRepository extends JpaRepository<Pickup, String>{

}
