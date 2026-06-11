/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class StringExample {
    public static void main(String args[]) {
        //1st method to show string
        String name="Manik";
        System.out.println(name);
        name=name+" Barad"; //appends the old value and points to the new value stored
        System.out.println("After appending = "+ name); 
        
        //2nd method to show string without storing
        System.out.println("Manik");
        
        //To show string in double quotation
        System.out.println("\"Manik\"");
        
        //To show  string in single quotation
        System.out.println("\'Manik\'");
        
        //To show string with one backslash
        System.out.println("\\Manik");
        
        //To show string with tab
        System.out.println("Manik\tBarad");
        
    }
}
