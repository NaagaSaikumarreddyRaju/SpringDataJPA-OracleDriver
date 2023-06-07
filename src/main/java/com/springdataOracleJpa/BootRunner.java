package com.springdataOracleJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class BootRunner implements CommandLineRunner {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public void run(String... args) throws Exception {
        Employee emp1 = new Employee();
        emp1.setEmpName("sai");
        emp1.setEmpSalary(100000.44);

        employeeRepo.save(emp1);

    }
}
