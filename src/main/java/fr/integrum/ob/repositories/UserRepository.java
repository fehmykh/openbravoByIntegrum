package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
