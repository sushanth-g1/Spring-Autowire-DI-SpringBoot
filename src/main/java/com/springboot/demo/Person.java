package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Person {

    private int personId;
    private String personName;
    private String personTech;
    @Autowired                                      //Person class depends on the Computer class,
    @Qualifier("comp1")                             // and the dependency is injected using the @Autowired annotation on the 'computer' attribute
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }


    public Person() {
        System.out.println(" Object Created ");
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonTech() {
        return personTech;
    }

    public void setPersonTech(String personTech) {
        this.personTech = personTech;
    }

    public void show(){
        computer.compile();
        System.out.println(" Person invoked ");
    }


}
