package fr.integrum.ob.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.models.Approval;

public interface ApprovalRepository extends JpaRepository<Approval, Integer>{

}
