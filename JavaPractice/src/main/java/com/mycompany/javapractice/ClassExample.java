/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
class Car
{
    String model;
    long price;
    void newModel(String m, int p)
    {
        model=m;    
        price=p;
    }
    void display()
    {
        System.out.println("Car Model = "+model);
        System.out.println("Car Price = "+price);
    }
}
public class ClassExample {
    public static void main(String args[]) {
        Car c1=new Car();
        c1.newModel("BMW",1500000);
        c1.display();
        
        Car c2=new Car();
        c2.model="Audi";
        c2.price=1500000;;
        c2.display();
    }
}
