package com.piotr.javacourse.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.io.*;
public class PersonTest {

    /*val is the local variable which store the informatiom about
    * number of person*/
int val;
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
    public void shouldReturnNumberOfPerson(){
        /*
        Person person5 = new Person("Lisa");
        Person person6 = new Person("Max");
        Person myPerson = new Person("Alex");
        Person myPerson2 = new Person("Siri");
        Person myPerson3 = new Person("John");
*/
        Person myPerson = new Person();
        assertEquals(1,val= myPerson.getPersonCounter());
        System.out.println(val);
        Person myPerson1 = new Person();
        val = myPerson1.getPersonCounter();
        System.out.println(val);
        Person myPerson2 = new Person();
        val = myPerson2.getPersonCounter();
        System.out.println(val);
        assertEquals(3, myPerson2.numberOfPersons() );
    }


   // Person person2 = new Person("Jane");




}
