/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
class M1
{
    String  name="Manik";
}
class M2 extends M1
{
    int age=18;
}
class  M3 extends M2
{
    long salary=2500000;
}
public class MultilevelInheritance {
    public static void main(String args[]) {
        M3 m=new M3();
        System.out.println("Name = "+m.name);
        System.out.println("Age = "+m.age);
        System.out.print("Salary = "+m.salary);
    }
}
