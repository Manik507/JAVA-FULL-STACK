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
public class SelectionSort {
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
        
        int smallest;
        for(int i=0;i<n-1;i++)  //// Run till the second last element because after n-1 passes, the last element is automatically sorted
        {
            smallest=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int ele:arr)
        {
            System.out.println(ele);
        }
    }
}
