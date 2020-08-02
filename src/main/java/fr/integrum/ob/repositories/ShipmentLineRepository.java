package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.ShipmentLine;

public interface ShipmentLineRepository extends JpaRepository<ShipmentLine, Integer>{

}
