package com.anandakshay.springdemoproject.dao;

import com.anandakshay.springdemoproject.model.Employee;

import java.util.List;

public interface EmployeeDao {

    int save(Employee employee);

    int update(Employee employee,int id);

    int delete(int id);

    List<Employee> getAll();

    Employee getById(int id);
}
