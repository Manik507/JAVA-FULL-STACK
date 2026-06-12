/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Problem14 {
    //Addition of two numbers using functions
    static int sum(int a, int b)
    {
        return a+b;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers to add = ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print("Addition = "+sum(n1,n2));
    }
}
