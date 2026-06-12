/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
public class Problem8 {
    public static void main(String args[]) {
        //Sum of odd numbers till 20 using while loop
        int sum=0;
        int n=1;
        while(n<=20)
        {
            if(n%2!=0)
            {
                sum+=n;
            }
            n++;
        }
        System.out.print("Addition of first 20 numbers is "+sum);
    }
}
