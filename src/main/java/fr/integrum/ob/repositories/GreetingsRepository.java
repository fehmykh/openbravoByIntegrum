package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.Greetings;

public interface GreetingsRepository extends JpaRepository<Greetings, Integer>{

}
