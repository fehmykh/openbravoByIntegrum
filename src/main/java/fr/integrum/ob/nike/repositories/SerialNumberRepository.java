package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.SerialNumber;

public interface SerialNumberRepository extends JpaRepository<SerialNumber, String>{

}
