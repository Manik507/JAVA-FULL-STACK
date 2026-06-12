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
public class Problem15 {
    //Problem to check whether number is even
    static boolean checkEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check whether it is even or not = ");
        int a=sc.nextInt();
        System.out.print("Result = "+checkEven(a));
    }
}
