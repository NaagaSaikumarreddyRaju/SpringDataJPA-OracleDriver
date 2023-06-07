package com.springdataOracleJpa;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Emp_Info")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String empName;
    @Column(name="Salary")
    private double empSalary;
}
