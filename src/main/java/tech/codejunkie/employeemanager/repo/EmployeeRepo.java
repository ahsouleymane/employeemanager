package tech.codejunkie.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.codejunkie.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
