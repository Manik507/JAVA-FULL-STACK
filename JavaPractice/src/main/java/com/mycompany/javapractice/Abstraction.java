/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
abstract class Device
{
    String name="Device";
    Device()
    {
        System.out.println("Device constructor called ");
    }
    void display()
    {
        System.out.println("This is the Device Class");
    }
    abstract void sound();
}
class Laptop extends Device
{
    String name="Laptop";
    Laptop()
    {
        super();
    }
    @Override
    void sound()
    {
        System.out.println("Laptop Starts");
    }
    void showDetails()
    {
        System.out.println("Variable name = "+name);
        System.out.println("Parent class variable name = "+super.name);
        super.display();
        sound();
    }
}
public class Abstraction {
    public static void main(String args[]) {
        Laptop l=new Laptop();
        l.showDetails();
    }
}
