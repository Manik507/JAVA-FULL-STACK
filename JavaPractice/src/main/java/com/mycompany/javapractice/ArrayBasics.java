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
public class ArrayBasics {
    public static void main(String args[]) {
        //Creating an array
        int age[]={10,20,30};
        
        //Accessing element in an array
        System.out.println("Accessing the second element = "+age[1]);
        
        //Changing element in array
        age[1]=18;
        System.out.println("Accessing the second element which is changed = "+age[1]);
        
        //Traversing the entire array
        for(int i=0;i<3;i++)
        {
            System.out.println(age[i]);
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
        
        //Creating an array from user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array you want to create = ");
        int size=sc.nextInt();
        
        int stud[]=new int[size];
        
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < size; i++) {
            stud[i]=sc.nextInt();
        }
        System.out.println("Entered Values :-");
        for(int i:stud)
        {
            System.out.println(i);
        }
    }
}
