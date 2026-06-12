/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
class Computer
{
    long price;
    String name;
    void display()  
    {
        System.out.println("Computer name = "+name);
        System.out.println("Computer price = "+price);
    }
}
class Person
{
    String name;
    int age;
    
    Person()      //Unparameterized Constructor - A constructor with no parameters
    {
        name="Manik";
        age=18;
    }
    Person(String name, int age)   //Parameterized Constructor - A constructor  with parameters
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}
public class ConstructorExample {
    public static void main(String args[]) {
        Person p1=new Person();
        p1.display();       
        
        Person p2=new Person("Aditi",18);
        p2.display();
        
        Computer c1=new Computer();
        c1.display();     //Default Constructor - automatically invoked by the java compiler to initialize the data members
    }
}
