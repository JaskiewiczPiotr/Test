package com.piotr.javacourse.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){
        Person marcus = new Person("Piotr");
        Person person1 = new Person("Tom");
        person1.setName("Lolo");

       // assertEquals("Hello world", marcus.helloWorld());

        assertEquals("Lolo", person1.getName());
    }
    @Test
    public void shouldReturnHello(){
        Person person3 = new Person("Jane");
        assertEquals("Hello Jane", person3.hello("Jane"));

    }
    @Test
    public void shouldReturnnumberOfPerson(){
        Person person5 = new Person("Lisa");
        Person person6 = new Person("Max");
        Person myPerson = new Person("Alex");
        Person myPerson2 = new Person("Siri");
        Person myPerson3 = new Person("John");

        assertEquals(3, myPerson.numberOfPersons() );
    }


   // Person person2 = new Person("Jane");




}
