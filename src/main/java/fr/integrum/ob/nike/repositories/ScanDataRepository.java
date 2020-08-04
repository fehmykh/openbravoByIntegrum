package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.ScanData;

public interface ScanDataRepository extends JpaRepository<ScanData, String>{

}
