package se.ecutb.loffe.inheritance_demo.model;

import java.time.LocalDate;

public abstract class Person implements Walkable{

    protected String name;
    protected LocalDate birthDate;

    public Person(String name, LocalDate birthDate){
        // super(); // pekar på den constructor som är inbyggd i object. Osynlig egentligen. Sker automatiskt.
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

}
