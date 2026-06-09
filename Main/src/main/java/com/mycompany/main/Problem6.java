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
public class Problem6 {
    //Number is odd or even
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.print("Entered number is 0");
        }
        else if(n%2==0)
        {
            System.out.print(n+" is even number");
        }
        else if (n%2!=0)
        {
            System.out.print(n+" is odd number");
        }
    }
}
