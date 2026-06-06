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
public class Login {
    public static void main(String args[]) {
        int originalpassword=1234;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the password : ");
        int input=sc.nextInt();
        if(originalpassword==input)
        {
            System.out.print("Login Successful");
        }
        else
        {
            System.out.print("Incorrect Password");
        }
    }
}
