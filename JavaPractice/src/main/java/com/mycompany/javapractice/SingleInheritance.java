/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 
package com.mycompany.javapractice;
import com.mycompany.javapractice.myPackage.*;

class Greetings extends MyClass
{
    //Myclass imported from another package
    //This class is the child class of  myclass so name can be only be accessible here not in the SingleInheritace class
    
    void show()
    {
        System.out.print(name);
    }
}
public class SingleInheritance {
    public static void main(String args[]) {
        // Error: protected member cannot be accessed here because
        // SingleInheritance is not a child class of MyClass.

        Greetings g1=new Greetings();
        g1.display();
        g1.show();
    }
}
