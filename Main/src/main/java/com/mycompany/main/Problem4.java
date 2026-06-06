/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Problem4 {
    public static void main(String args[]) {
        //swap 2 numbers without  temporary  variable
        int num1=10;
        int num2=20;
        num1=num1+num2; //30
        num2=num1-num2; //20
        num1=num1-num2; //30-10=20
        System.out.print(num1+" "+num2);
    }
}
