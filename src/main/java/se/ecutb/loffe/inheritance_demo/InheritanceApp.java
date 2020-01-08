package se.ecutb.loffe.inheritance_demo;

import se.ecutb.loffe.inheritance_demo.model.Employee;
import se.ecutb.loffe.inheritance_demo.model.Person;

import java.time.LocalDate;

public class InheritanceApp {
    public static void main(String[] args) {
        /*
        Person p = new Person("Nisse", LocalDate.parse("2001-02-21"));
        Object obj = p;
        Object obj2 = new Person("Olle", LocalDate.parse("2000-01-01"));
        // Person p2 = obj2; // ERROR. Required Person, provided Object.
        Person p2 = (Person) obj2;

        Employee empl = (Employee) p; // Tillåts, men funkar inte. Person cannot be cast to Employee


        System.out.println(p);
        System.out.println(obj);
        System.out.println(obj2);

        */

        Employee empl = new Employee(1, 999.99, "Bruce Wayne", LocalDate.parse("2000-01-01"));
        empl.walk();
        empl.stopWalking();


    }
}
