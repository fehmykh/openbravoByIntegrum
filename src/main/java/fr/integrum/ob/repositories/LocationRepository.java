package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.Location;

public interface LocationRepository extends JpaRepository<Location, Integer>{

}
