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
public class Calculator {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1=sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2=sc.nextInt();
        
        System.out.print("Enter which operation you want to perform (+,-,*,/,%) : ");
        char op=sc.next().charAt(0);
        
        if(op=='+')
        {
            System.out.print(n1 + "+" + n2 + "=" + (n1+n2));
        }
        else if(op=='-')
        {
            System.out.print(n1 + "-" + n2 + "=" +(n1-n2));
        }
        else if(op=='*')
        {
            System.out.print(n1 + "*" + n2 + "=" +(n1*n2));
        }
        else if(op=='/')
        {
            if(n2==0)
            {
                System.out.print("Cannit divide by zero");
            }
            else
            {
               System.out.print(n1 + "/" + n2 + "=" +(n1/n2));
            }
        }
        else
        {
            System.out.print(n1 + "%" + n2 + "=" + (n1%n2));
        }
    }
}
