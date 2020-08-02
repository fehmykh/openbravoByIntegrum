package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.Error;

public interface ErrorRepository extends JpaRepository<Error, Integer>{

}
