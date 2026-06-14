/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
class Hello
{
    void display()
    {
        System.out.print("Good  morning");
    }
}
class Greetings extends Hello
{
    
}
public class SingleInheritance {
    public static void main(String args[]) {
        Greetings g1=new Greetings();
        g1.display();
    }
}
