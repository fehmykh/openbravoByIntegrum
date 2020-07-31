package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.UserLocation;

public interface UserLocationRepository extends JpaRepository<UserLocation, Integer>{

}
