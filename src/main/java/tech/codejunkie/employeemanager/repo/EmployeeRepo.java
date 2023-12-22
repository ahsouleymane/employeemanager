package tech.codejunkie.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.codejunkie.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);
    Optional findEmployeeById(Long id);
}
