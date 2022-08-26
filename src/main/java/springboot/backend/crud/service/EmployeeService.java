package springboot.backend.crud.service;

import springboot.backend.crud.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployeeById(Employee employee, long id);
    void deleteEmployee(long id);
}
