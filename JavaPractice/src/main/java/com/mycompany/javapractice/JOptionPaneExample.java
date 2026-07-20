/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JOptionPaneExample {
    public static void showInputCancelledMessage()
    {
        JOptionPane.showMessageDialog(null,"Input Cancelled");
    }
    public static void main(String args[]) {
        
        JOptionPane.showMessageDialog(null,"Welcome to the Student Registration System");
        
        String name=JOptionPane.showInputDialog(null,"Enter the name ");
        if(name==null)
        {
            showInputCancelledMessage();
            return;
        }
        String age=JOptionPane.showInputDialog(null,"Enter the age");
        if(age==null)
        {
            showInputCancelledMessage();
            return;
        }
        
        String course=JOptionPane.showInputDialog(null,"Enter your course");
        if(course==null)
        {
            showInputCancelledMessage();
            return;            
        }
        
        int choice=JOptionPane.showConfirmDialog(null,"Do you want to confirm the registration");
        if(choice==JOptionPane.NO_OPTION || choice==JOptionPane.CANCEL_OPTION || choice == JOptionPane.CLOSED_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Student Registration Cancelled");
            return;
        }
        else
        {
            String[] details={"View Details","Edit Later","Exit"};
            int n=JOptionPane.showOptionDialog(null,"Select an Option","Process",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,details,details[2]);
            if(n==0)
            {
                JOptionPane.showMessageDialog(null,"Name = "+name+"\nAge = "+age+"\nCourse = "+course);
            }
            else if(n==1)
            {
                JOptionPane.showMessageDialog(null,"You can edit later");
            }
            else if(n==2)   
            {
                JOptionPane.showMessageDialog(null, "Bye");
                return;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No Option Selected");
            }
        }
    }
}
