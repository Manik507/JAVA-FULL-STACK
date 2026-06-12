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
public class Login {
    //Login Authentication
    public static void main(String args[]) {
        int originalPassword=1234;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the password : ");
        int inputPassword=sc.nextInt();
        if(originalPassword==inputPassword)
        {
            System.out.print("Login Successful");
        }
        else
        {
            System.out.print("Incorrect Password");
        }
    }
}
