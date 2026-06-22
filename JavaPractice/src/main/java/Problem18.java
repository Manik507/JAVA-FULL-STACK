
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Problem18 {
    public static void main(String args[]) {
        //Counting odd and even numbers in an array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        System.out.println("Enter the elements of the array :-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int oddCount=0;
        int evenCount=0;
        for(int i:arr)
        {
            if(i%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.out.println("Count of the even numbers = "+evenCount);
        System.out.println("Count of the odd numbers = "+oddCount);
    }
}
