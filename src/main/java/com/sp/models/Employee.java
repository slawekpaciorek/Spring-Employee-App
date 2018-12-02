package com.sp.models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="employee")
public class Employee {

    @Min(value = 1, message = "id must be grater than 1")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "required")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "required")
    @Column(nullable = false)
    private String lastName;

    @NotNull(message = "required")
    @Column(unique = true, nullable = false)
    private String email;

    @NotNull(message = "required")
    @Min(value = 1260, message = "basic salary is equal to 1260")
    @Max(value = 20000, message = "max salary is equal to 20000")
    @Column(nullable = false)
    private Double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name= '" + name + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", salary= " + salary +
                ", email= '" + email + '\'' +
                '}';
    }

    public Employee(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
