/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
class A
{
    void show(int age)
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("Class B");
    }
}
public class CompileTimePolymorphism {
    public static void main(String args[]) {
        B b=new B();
        b.show();
        b.show(18);
    }
}
