/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
public class ArrayBasics {
    public static void main(String args[]) {
        //Creating an array
        int age[]={10,20,30};
        
        //Accessing element in an array
        System.out.println("Accessing the second element = "+age[1]);
        
        //Changing element in array
        age[1]=18;
        System.out.print("Accessing the second element which is changed = "+age[1]);
        
        //Traversing the entire array
        for(int i=0;i<3;i++)
        {
            System.out.println(age[i]);
        }
        
        //For each loop
        System.out.println("For each :- ");
        for(int i:age)
        {
            System.out.print(i);
        }
        
        //Declaring array  with new keyword
        int arr[]=new int[5];
        
        //Inserting the values
        arr[0]=10;
        arr[1]=20;
        
        //Accessing the array using for each loop
        for(int i:arr)
        {
            System.out.println(i); //Remaining elements initialized automatically based on the data type
        }
    }
}
