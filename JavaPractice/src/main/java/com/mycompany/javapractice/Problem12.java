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
public class Problem12 {
    public static void main(String args[]) {
        //Guessing Game
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        
        int randomNum=random.nextInt(100)+1;
        int inputNum;
        int n=0;
        System.out.print("Enter the number to guess = ");
        do
        {
            inputNum=sc.nextInt();
            n++;
            if(inputNum==randomNum)
            {
                System.out.print("Guessed correctly! in "+n+" tries");
            }
            else if(inputNum>randomNum)
            {
                System.out.print("Entered number is too high. \nEnter correct number = ");
            }
            else if(inputNum<randomNum)
            {
                System.out.print("Entered number is too low. \nEnter correct number = ");
            }
        }while(true);
    }
}
