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
public class Problem7 {
    public static void main(String args[]) {
        //Grade System
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks (Max 50 for each subject)\n");
        System.out.print("Software Testing = ");
        int s=sc.nextInt();
        System.out.print("Machine Learning = ");
        int m=sc.nextInt();
        int total=(s+m)/2;
        if(total>=90 && total<100)
        {
            System.out.print("Grade A");
        }
        else if(total>=80 && total<90)
        {
            System.out.print("Grade B");
        }
        else
        {
            System.out.print("Fail");
        }
    }
}
