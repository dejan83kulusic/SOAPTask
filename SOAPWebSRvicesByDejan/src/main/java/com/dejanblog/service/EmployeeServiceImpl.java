package com.dejanblog.service;

import com.dejanblog.repo.Employee;
import com.dejanblog.repo.OfflineRepository;
import org.springframework.stereotype.Component;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;
@Component
public class EmployeeServiceImpl{
    List<Employee> listOfEmployee=
            OfflineRepository.getEmployee();
    public Employee getEmployee(int employeeId) {
        Optional<Employee> employee = listOfEmployee.stream()
                        //input condition is true of false, boolean
                        .filter(emp -> emp.getEmployeeId() == employeeId)
                        //return list of employee
                        .findFirst();

        return employee.get();
    }

    public List<Employee> getAllEmployee() {
        return listOfEmployee;
    }

    public boolean removeEmployee(int employeeId) {
        Iterator<Employee> iterator = listOfEmployee.iterator();
        while(iterator.hasNext()){
            Employee emp=iterator.next();
            if(employeeId==emp.getEmployeeId()) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }
}
