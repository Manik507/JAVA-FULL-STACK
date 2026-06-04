/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class TypeCasting {
    public static void main(String args[]) {
        //implicit casting - lower data type to  higher data type
        //boolean->short->char->int->long->float->double
        
        int a=5;
        double b=a;
        
        System.out.println(b);
        
        //explicit casting - higher data type to lower data type
        //double->float->long->int->char->short->boolean
        
        double num1=14.5;
        int num2=(int) num1;
        
        System.out.print(num2);
        
    }
}
