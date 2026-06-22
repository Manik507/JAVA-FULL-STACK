/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class Problem16 {
    public static void main(String args[]) {
        //Finding the maximum and minimum element in the array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        System.out.println("Enter the elements of the array :-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum Element = "+max);
        System.out.println("Minimum Element = "+min);
    }
}
