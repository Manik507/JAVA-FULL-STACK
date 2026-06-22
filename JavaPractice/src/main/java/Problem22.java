
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Problem22 {
    public static void main(String args[]) {
        //Find index of a given element
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array :-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Enter the element you want to find :- ");
        int element=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(element==arr[i])
            {
                System.out.println("Element found at index "+i);
                found=true;
                break;
            }
        }
        if(found==false)
        {
            System.out.println("Element not found in the array");
        }
    }
}
