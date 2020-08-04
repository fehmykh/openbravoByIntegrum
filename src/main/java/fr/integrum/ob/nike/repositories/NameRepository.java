package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Name;

public interface NameRepository extends JpaRepository<Name, String>{

}
