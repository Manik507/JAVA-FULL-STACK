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
public class CheckVowel {
    public static void main(String args[]) {
        //Whether entered character is vowel  or not
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an character");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.print("You entered an vowel");
                break;
            default:
                System.out.print("You not entered an vowel");
        }
    }
}
