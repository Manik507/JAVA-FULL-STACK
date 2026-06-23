package com.mycompany.javapractice;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Problem21 {
    public static void main(String args[]) {
        //Checking if array is sorted in ascending order or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array :-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                sorted=false;
            }
        }
        if(sorted==false)
        {
            System.out.println("Array is not sorted in ascending order");
        }
        else
        {
            System.out.println("Array is sorted in ascending order");
        }
    }
}
