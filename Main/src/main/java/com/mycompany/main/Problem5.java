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
public class Problem5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.print(n+" is Positive");
        }
        else if(n<0)
        {
            System.out.print(n+" is Negative");
        }
        else
        {
            System.out.print("Entered Number is Zero");
        }
    }
}
