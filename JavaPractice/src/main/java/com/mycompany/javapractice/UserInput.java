/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;
import java.util.Scanner;;
/**
 *
 * @author Admin
 */
public class UserInput {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num1=sc.nextInt();
        
        System.out.print("Enter another number : ");
        int num2 = sc.nextInt();
 
        // nextInt() reads only the number and leaves the Enter key (\n) in the input buffer.
        // Without this line, the next nextLine() will read that leftover Enter and skip user input.    
        // Adding one more nextLine() after nextInt() consumes that leftover line
        // The leftover Enter after num1 is ignored when reading num2 with nextInt().
        // nextInt() sees the leftover and simply skips it because it is whitespace. Then it reads the num2
        sc.nextLine();

        int sum=num1+num2;
        System.out.print("Sum = "+sum);
        
        
        System.out.print("\nEnter your name : ");
        String name = sc.nextLine();
        System.out.print("Hello "+name);
    }
}
