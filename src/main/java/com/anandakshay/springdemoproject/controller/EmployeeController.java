package com.anandakshay.springdemoproject.controller;

import com.anandakshay.springdemoproject.dao.EmployeeDao;
import com.anandakshay.springdemoproject.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao eDao;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return eDao.getAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return eDao.getById(id);
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        return eDao.save(employee)+" Employee added";
    }

    @PutMapping("/employees/{id}")
    public String updateEmployee(@RequestBody Employee employee,@PathVariable int id){
        return eDao.update(employee,id)+" Employee updated";
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return eDao.delete(id)+" Employee deleted";
    }
}
