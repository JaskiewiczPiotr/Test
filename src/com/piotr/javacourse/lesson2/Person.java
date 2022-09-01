package com.piotr.javacourse.lesson2;
import com.piotr.javacourse.lesson3.Name;

public class Person {

    private Name personName;
    private static int personCounter;
    public Person(){
        personCounter++;
    }

    public static int getPersonCounter() {
        return personCounter;
    }


    private String name;
    public Person(String name){
        this.name = name;

    }

    public String helloWorld() {
        return "Hello world";
    }

    public Name name(){
        return personName;
    }

    public String getName() {
        return name;

    }

    public String setName(String newName){
        this.name = newName;
        return "Lukas";
    }

    public String hello(String name){
        return "Hello"+ " " + name;
    }

    public static int numberOfPersons(){
        return personCounter;
    }
}
