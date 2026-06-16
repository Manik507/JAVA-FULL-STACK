/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
class Animal
{
    void sound()
    {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.print("Cat Meows");
    }
}
public class RunTimePolymorphism {    
    public static void main(String args[]) {
        Animal a=new Animal();
        a.sound();
        Animal d=new Dog();
        d.sound();
        Animal c=new Cat();
        c.sound();
    }
}
