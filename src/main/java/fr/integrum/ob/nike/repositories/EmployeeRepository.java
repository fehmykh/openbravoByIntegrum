package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

}
