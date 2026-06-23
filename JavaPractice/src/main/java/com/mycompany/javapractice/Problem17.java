package com.mycompany.javapractice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class Problem17 {
    public static void main(String args[]) {
        //Sum  of all elements in the array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        System.out.println("Enter the elements of the array :-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        System.out.print("Sum of all the elements in the array is "+sum);
    }
}
