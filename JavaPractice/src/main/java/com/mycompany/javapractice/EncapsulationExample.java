/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */

class Student
{
    private String name;
    public String college;
    public void setName(String name)     //Can be also done using constructor
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void display()
    {
        System.out.println("Name = "+name);
        System.out.println("College = "+college);
    }
}
public class EncapsulationExample {
    public static void main(String args[]) {
        Student s1=new Student();
        s1.setName("Manik");       //Variable directly not accessible because it has private access specifier
        s1.college="IIT college";  //Variable directly accessible because it has public access specifier
        System.out.println("Displaying name using getName() = "+s1.getName());
        System.out.println("Displaying using display() :- ");
        s1.display();
    }
}
