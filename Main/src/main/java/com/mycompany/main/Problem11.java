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
public class Problem11 {
    public static void main(String args[]) {
        //Check password until the correct one is entered
        Scanner sc=new Scanner(System.in);
        String originalPassword="2407";
        System.out.print("Enter the password = ");
        String inputPassword;
        do{
            inputPassword=sc.nextLine();
            if(inputPassword.equals(originalPassword))
            {
                System.out.print("Login Successful");
                break;
            }
            else
            {
                System.out.println("Incorrect Password, Enter correct password = ");
            }
        }while(true);
    }
}
