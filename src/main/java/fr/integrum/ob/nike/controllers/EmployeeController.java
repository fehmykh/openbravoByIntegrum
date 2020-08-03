package fr.integrum.ob.nike.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.nike.repositories.EmployeeRepository;
import fr.integrum.ob.nike.retailmodels.Employee;

@RestController
@RequestMapping(value = "/nk")
public class EmployeeController {
	
	private static Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
    public Page<Employee> getEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }
	
	@PostMapping("/employees")
    public Employee createEmployee(@Validated @RequestBody Employee employee) {
		LOG.info("Employee created. ");
        return employeeRepository.save(employee);
    }

}
