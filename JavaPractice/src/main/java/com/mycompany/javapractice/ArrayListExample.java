/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;
import java.util.*;
/**
 *
 * @author Admin
 */
public class ArrayListExample {
    public static void main(String args[]) {
        //Creating Array List
        ArrayList<String> list=new ArrayList<>();
        
        //Adding Items in Array List
        list.add("Tony");
        list.add("Stark");
        
        //Printing the Array List
        System.out.println(list);
        
        //Inserting Element at specific position
        list.add(1,"IronMan");   
        System.out.println(list);
       
        //Accessing Specific Element
        System.out.println(list.get(1));
        
        //Changing the value
        list.set(0,"Hi Tony");
        System.out.println(list);
        
        //Removing the element
        list.remove(0);
        System.out.println(list);
        
        //Accessing list through a loop
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        
        //Sorting the list
        Collections.sort(list);
        System.out.println(list);
        
        //Removing all the data from the list
        list.clear();
        System.out.println(list);
    }
}
