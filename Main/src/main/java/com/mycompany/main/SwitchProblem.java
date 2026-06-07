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
public class SwitchProblem {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the vehicle type (car,bus,truck) = ");
        String vehicleType=sc.next();
        int fee=0;
        switch(vehicleType)
        {
            case "car":
                fee=5;
                break;
           
            case "bus":
                fee=10;
                break;
             
            case "truck":
                fee=40;
                break;
                
            default:
                System.out.print("Unknown Vehicle Type\n");
        }
        System.out.print("Parking Fee for "+vehicleType+" is $"+fee);
    }
}
