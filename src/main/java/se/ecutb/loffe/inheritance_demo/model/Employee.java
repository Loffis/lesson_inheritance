package se.ecutb.loffe.inheritance_demo.model;

import java.time.LocalDate;

public class Employee extends Person{

    protected int employeeId;
    protected double salary;

    public Employee(int employeeId, double salary, String name, LocalDate birthDay){
        this(name, birthDay);
        this.employeeId = employeeId;
        this.salary = salary;

    }

    private Employee(String name, LocalDate birthDate){
        super(name, birthDate);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void stopWalking() {
        System.out.println("...stop");
    }
}
