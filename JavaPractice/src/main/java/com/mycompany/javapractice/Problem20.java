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
public class Problem20 {
    public static void main(String args[]) {
        //Finding the second largest element in the array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array :-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max1)
            {
                max2=max1;
                max1=i;
            }
            else if(i>max2 && i!=max1)  
            {
                max2=i;
            }
        }
        
        
        System.out.print("Second Largest element in the array = "+max2);
    }
}
