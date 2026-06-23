package com.mycompany.javapractice;


import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Problem23 {

    private static int INT_MIN;
    public static void main(String args[]) {
        //Finding Majority element in the array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array :-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        //Brute Force Approcah 
        
        /*
        int freq=0;
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                    freq++;
            }
            if(freq>n/2)
            {
                found=true;
                System.out.println("Majority Element is "+arr[i]);
                break;
            }
            freq=0; //Resettinng the frequency  count of  the  next number to 0
        }
        if(!found)
        {
            System.out.println("No Majority Element present in the above array");
        }
        
        */
        
        //Optimal Approach
        
        /*
        boolean found=false;
        Arrays.sort(arr);
        int count = 1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count>n/2)
            {
                found=true;
                System.out.println(arr[i]+" is the Majority Element");
                break;
            }
     
        }
        if(!found)
        {
            System.out.println("No Majority Element in the array");
        }
        
        */
        
        //Moore's Voting Algorithm
        int cand=0;
        int count=0;
        for(int ele:arr)
        {
            if(count==0)
            {
                cand=ele;
            }
            if(cand==ele)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        count=0;
        for(int ele:arr)
        {
            if(cand==ele)
            {
                count++;
            }
        }
        if(count>n/2)
        {
            System.out.println(cand+" is the Majority Element");
        }
        else
        {
            System.out.println("No Majority Element Present");
        }
    }
}
