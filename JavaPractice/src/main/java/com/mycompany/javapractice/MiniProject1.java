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
class Student
{
    int roll;
    String name;
    int age;
    int marks;
    
    Student(int roll, String name, int age, int marks)
    {
        this.roll=roll;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
}
public class MiniProject1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Student Management System");
        ArrayList<Student> list=new ArrayList<>();
        boolean isRunning=true;
        while(isRunning)
        {
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Update Student Details");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            int input=sc.nextInt();
            switch(input)
            {
                case 1:
                    System.out.println("Enter Student's Roll Number - ");
                    int roll=sc.nextInt();
                    sc.nextLine();
                    boolean duplicateRoll=false;
                    for(Student s:list)
                    {
                        if(s.roll==roll)
                        {
                            duplicateRoll=true;
                            break;
                        }
                    }
                    if(!duplicateRoll)
                    {
                        System.out.println("Enter Student's Name - ");
                        String name=sc.nextLine();
                        System.out.println("Enter Student's Age - ");
                        int age=sc.nextInt();
                        System.out.println("Enter Student's Marks - ");
                        int marks=sc.nextInt();
                        sc.nextLine();
                    
                        list.add(new Student(roll,name,age,marks));
                        System.out.println("Student Successfully Added");
                    }       
                    else 
                    {
                        System.out.println("Student with that Roll Number Already Exists");
                    }
                    break;
                
                case 2:
                                       
                    
                case 6:
                    isRunning=false;
                    break;
                 
                default:
                    System.out.println("Enter the Valid Input");
            }
        }
    }
}
