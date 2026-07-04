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
class myStudent
{
    int roll;
    String name;
    int age;
    float marks;
    
    myStudent(int roll, String name, int age, float marks)
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
        ArrayList<myStudent> list=new ArrayList<>();
        
        boolean isRunning=true, rollFound=false;
        int input,age=-1,roll=-1,option,newRoll=-1,newAge=-1;
        float marks=-1,newMarks=-1;
        String name="",newName="";
        boolean duplicateRoll=false;
        
        while(isRunning)
        {
            System.out.println("-------------------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Update Student Details");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("Enter the Choice - ");
            
            if(sc.hasNextInt())
            {
                input=sc.nextInt();
                sc.nextLine();
            }
            else
            {
                System.out.println("Not a Valid Input");
                sc.nextLine();
                continue;
            }
            switch(input)
            {
                case 1:
                    
                    System.out.println("Enter Student's Roll Number - ");
                    if(sc.hasNextInt())
                    {
                        roll=sc.nextInt();
                        sc.nextLine();
                        if(roll<=0)
                        {
                            System.out.println("Not a Valid Roll Number");
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("Not a Valid Roll Number");
                        sc.nextLine();
                        break;
                    }
                    
                    duplicateRoll=false;
                    for(myStudent s:list)
                    {
                        if(s.roll==roll)
                        {
                            duplicateRoll=true;
                            System.out.println("Student with the Roll Number "+roll+" already exists");
                            break;
                        }
                    }
                    if(!duplicateRoll)
                    {
                        System.out.println("Enter Student's Name - ");
                        if(sc.hasNextLine())
                        {
                            name=sc.nextLine();
                            if(name.isBlank())
                            {
                                System.out.println("Name cannot be empty");
                                break;
                            }
                        }
                        
                        System.out.println("Enter Student's Age - ");
                        if(sc.hasNextInt())
                        {
                            age=sc.nextInt();
                            sc.nextLine();
                            if(age<=0)
                            {
                                System.out.println("Not a Valid Age");
                                break;
                            }
                        }
                        else
                        {
                            System.out.println("Not a Valid Age");
                            sc.nextLine();
                            break;
                        }
                        System.out.println("Enter Student's Marks (0 to 100) - ");
                        if(sc.hasNextFloat())
                        {
                            marks=sc.nextFloat();
                            sc.nextLine();
                            if(marks>100 || marks<0)
                            {
                                System.out.println("Not the valid marks");
                                break;
                            }
                        }
                        else
                        {
                            System.out.println("Not the valid Marks");
                            sc.nextLine();
                            break;
                        }
                        list.add(new myStudent(roll,name,age,marks));
                        System.out.println("Student Successfully Added");
                    }       
                    else 
                    {
                        System.out.println("Student with that Roll Number Already Exists");
                    }
                    break;
                
                case 2:
                    if(list.isEmpty())
                    {
                        System.out.println("No Students Present in the list");
                    }
                    else
                    {
                        for(myStudent s:list)
                        {
                            System.out.println("--------");
                            System.out.println("Name - "+s.name);
                            System.out.println("Roll - "+s.roll);
                            System.out.println("Age - "+s.age);
                            System.out.println("Marks - "+s.marks);
                        }
                    }
                    break;
                    
                case 3:
                    if(list.isEmpty())
                    {
                        System.out.println("No Students in the List");
                        break;
                    }
                    System.out.println("Enter the Roll Number :- ");

                    if(sc.hasNextInt())
                    {
                        roll=sc.nextInt();
                        sc.nextLine();
                        
                        if(roll<=0)
                        {
                            System.out.println("Not a Valid Roll Number");
                            break;
                        }
                        rollFound=false;
                        for(myStudent s:list)
                        {
                            if(roll==s.roll)
                            {
                                System.out.println("--------");
                                System.out.println("Name - "+s.name);
                                System.out.println("Roll - "+s.roll);
                                System.out.println("Age - "+s.age);
                                System.out.println("Marks - "+s.marks);
                                rollFound=true;
                                break;
                            }
                        }
                        if(!rollFound)
                        {
                            System.out.println("No Student with Roll Number "+roll+" exists");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Roll Number");
                        sc.nextLine();
                        break;
                    }
                    break;
                    
                case 4:
                    rollFound=false;
                    if(list.isEmpty())
                    {
                        System.out.println("Student List is Empty");
                        break;
                    }
                    
                    System.out.println("Enter the Roll Number of the Student - ");
                    if(sc.hasNextInt())
                    {
                        roll=sc.nextInt();
                        sc.nextLine();
                        if(roll<=0)
                        {
                            System.out.println("Invalid Roll Number");
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Roll Number");
                        break;
                    }
                    
                    for(myStudent s:list)
                    {
                        if(s.roll==roll)
                        {
                            System.out.println("Student Details - ");
                            System.out.println("Name - "+s.name);
                            System.out.println("Roll - "+s.roll);
                            System.out.println("Age - "+s.age);
                            System.out.println("Marks - "+s.marks);
                            rollFound=true;
                            break;
                        }
                    }
                    if(rollFound)
                    {
                        System.out.println("----------------");
                        System.out.println("Select the option what you want to update of the above Student - ");
                        System.out.println("1. Roll Number");
                        System.out.println("2. Name");
                        System.out.println("3. Age");
                        System.out.println("4. Marks");
                        System.out.println("Enter the option - ");
                        if(sc.hasNextInt())
                        {
                            option=sc.nextInt();
                            sc.nextLine();
                        }
                        else
                        {
                            System.out.println("Not the valid Input");
                            sc.nextLine();
                            break;
                        }
                        
                        switch(option)
                        {
                            case 1:
                                duplicateRoll=false;
                                System.out.println("Enter the New Roll Number - ");
                                if(sc.hasNextInt())
                                {
                                    newRoll=sc.nextInt();
                                    sc.nextLine();
                                    if(newRoll<=0)
                                    {
                                        System.out.println("Not a Valid Roll Number");
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Not a Valid Roll Number");
                                    sc.nextLine();
                                    break;
                                }          
                                for(myStudent s:list)
                                {
                                    if(s.roll==newRoll)
                                    {
                                        System.out.println("Student with Roll Number "+newRoll+" already exists");
                                        duplicateRoll=true;
                                        break;
                                    }
                                }
                                if(!duplicateRoll)
                                {
                                    for(myStudent s:list)
                                    {
                                        if(s.roll==roll)
                                        {
                                            s.roll=newRoll;
                                            System.out.println("Roll Number Updated");
                                            break;
                                        }
                                    }
                                }
                                break;
                                
                            case 2:
                                System.out.println("Enter the Updated Name - ");
                                if(sc.hasNextLine())
                                {
                                    newName=sc.nextLine();
                                    if(newName.isBlank())
                                    {
                                        System.out.println("Invalid Name");
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Not a Valid Name");
                                    sc.nextLine();
                                    break;
                                }
                                for(myStudent s:list)
                                {
                                    if(roll==s.roll)
                                    {
                                        s.name=newName;
                                        System.out.println("Name Updated Successfully");
                                        break;
                                    }
                                }
                                break;
                                
                            case 3:
                                System.out.println("Enter the updated Age - ");
                                if(sc.hasNextInt())
                                {
                                    newAge=sc.nextInt();
                                    sc.nextLine();
                                    if(newAge<=0)
                                    {
                                        System.out.println("Invalid Age");
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Invalid Age");
                                }
                                for(myStudent s:list)
                                {
                                    if(s.roll==roll)
                                    {
                                        s.age=newAge;
                                        System.out.println("Age Updated Successfully");
                                        break;
                                    }
                                }
                                break;
                              
                            case 4:
                                System.out.println("Enter the latest Marks (0 to 100) - ");
                                if(sc.hasNextFloat())
                                {
                                    newMarks=sc.nextFloat();
                                    sc.nextLine();
                                    if(newMarks<0 || newMarks>100)
                                    {
                                        System.out.println("Not Valid Marks");
                                        break;
                                    }
                                }
                                else
                                {
                                    System.out.println("Not Valid Marks");
                                    sc.nextLine();
                                    break;
                                }
                                for(myStudent s:list)
                                {
                                    if(roll==s.roll)
                                    {
                                        s.marks=newMarks;
                                        System.out.println("Latest Marks Updated");
                                        break;
                                    }
                                }
                                break;
                                
                            default:
                                System.out.println("Not a Valid Option");
                        }
                    }
                    else
                    {
                        System.out.println("No student with Roll Number "+roll+" Present in the list");
                    }
                    break;
                
                case 5:
                    rollFound=false;
                    if(list.isEmpty())
                    {
                        System.out.println("No students present in the list");
                        break;
                    }
                    System.out.println("Enter the Roll Number of the Student - ");
                    if(sc.hasNextInt())
                    {
                        roll=sc.nextInt();
                        sc.nextLine();
                        if(roll<=0)
                        {
                            System.out.println("Not a valid Roll Number");
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Roll Number");
                    }
                    for(myStudent s:list)
                    {
                        if(roll==s.roll)
                        {
                            list.remove(s);
                                rollFound=true;
                            break;
                        }
                    }
                    if(rollFound)
                    {
                        System.out.println("Student Removed Successfully");
                    }
                    else
                    {
                        System.out.println("No Student with Roll Number "+roll+" exists in the list");
                    }
                    break;
                    
                case 6:
                    isRunning=false;
                    break;
                 
                default:
                    System.out.println("Not the Valid Input");
            }
        }
    }
}