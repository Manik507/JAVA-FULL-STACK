/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
class First
{
    int num=18;
}
class Second extends First
{
    String name="Manik";
}
class Third extends First
{
    long salary=2500000;
}
public class HierarchicalInheritance {
    public static void main(String args[]) {
        Second s1=new Second();
        Third t1=new Third();
        System.out.println("Second child access :-");
        System.out.println(t1.salary+" Own Class");
        System.out.println(t1.num+" Parent Class");
        
        System.out.println("Third child access :- ");
        System.out.println(s1.name+" Own Class");
        System.out.println(s1.num+" Parent Class");
    }
}
