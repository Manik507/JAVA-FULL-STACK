/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class StringMethods {
    public static void main(String args[]) {
        String firstName="Manik";
        String lastName=" Barad";
        
        //Concatenation methods
        String fullName=firstName+lastName;
        System.out.println("Using \'+\' = "+fullName);
        System.out.println(firstName.concat("Using concat = "+lastName));
        
        //Length returns integer value
        System.out.println("First Name Length = "+firstName.length());
        
        //check string contains a word or not and returns boolean value
        System.out.println("Checking whether first name contains character \"i\" = "+firstName.contains("i"));
        
        //Uppercae, does not changes actual string
        System.out.println("Converting first name to upper case = "+firstName.toUpperCase());
        
        //Lowercase, does not changes actual string
        System.out.println("Converting last name to lower case = "+lastName.toLowerCase());
        
        //Comparing two strings and returns a boolean value
        System.out.println("Comparing first name with lasat name = "+firstName.equals(lastName));
        
        //Comparing two strings with ignore case methods which converts both strings in any one case and compares it and returns boolean value
        System.out.println("Comparing first name with last name with ignore case = "+firstName.equalsIgnoreCase(lastName));
        
        //Replace method :- first parameter what to change and second parameter changed value '' for characters and "" for strings to replace
        //does not changes actual string
        System.out.println("Replacing \"i\" with \"e\" = "+firstName.replace('i','e'));
        
        //Trim method removes space from both ends but not in between and does not changes actual string
        System.out.println("Trim method on last name = "+lastName.trim());
        
        //IndexOf method returns the first occurence of the letter
        System.out.println("First occurence of character \'i\' = "+firstName.indexOf('i'));
    }
}
