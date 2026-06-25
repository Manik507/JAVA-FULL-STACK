/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BubbleSort {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array :-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n-1;i++)   
            // Loop till the second last element because after each pass one element reaches its correct position,
            //so after (n-1) passes the last element is automatically sorted
        {    
            for(int j=0;j<n-1-i;j++)       
            // Inner loop compares adjacent elements
            // After every pass, the largest element reaches its correct position
            // Therefore, we reduce the number of comparisons by i
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
