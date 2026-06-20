/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
public class WrapperClasses {
    public static void main(String args[]) {
        
        
        //Converting primitive type to object type
        int a=18;
        Integer i=Integer.valueOf(a);
        Integer j=a;   //autoboxing - done by the compiler
        
        System.out.println("Primitive type = "+a);
        System.out.println("Object type = "+i+" "+j);
        
        
        
        //Converting from object to primitive
        int m=i.intValue();
        int n=i; //Unboxing - done by the compiler
        
        System.out.println("Object type = "+i);
        System.out.println("Primitive type = "+m+" "+n);
        
        
        
        
        //Character Example
        char c='a';
        Character y=Character.valueOf(c);
        Character z=c; //autoboxing 
        
        char w=y.charValue();
        char x=y; //Unboxing
        
        
        
        //Boolean Example
        boolean b=true;
        Boolean obj=Boolean.valueOf(b);
        boolean d=obj.booleanValue();
    }   
}
