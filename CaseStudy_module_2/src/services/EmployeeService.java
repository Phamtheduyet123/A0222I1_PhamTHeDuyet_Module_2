package services;

import models.Employee;

public interface EmployeeService extends Service {
    void addNewEmployee(Employee e);
    void editEmployee(Employee e,int id);
}
