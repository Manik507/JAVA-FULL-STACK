/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class MyLinkedList {
    class Node
    {
        String data;
        Node next;
        
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    //Add First
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    //Add Last
    public void addLast(String data)
    {
        
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    
    //Remove First
    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("No nodes in the list present");
            return;
        }
        head=head.next;
    }
    
    //Remove Last
    public void removeLast()
    {
        if(head==null)
        {
            System.out.println("No nodes present in the list");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    
    //Print List
    public void printList()
    {
        if(head==null)
        {
            System.out.println("No nodes in the list");
            return;
        }
        
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("NULL");
    }
    public static void main(String args[]) {
        MyLinkedList ll=new MyLinkedList();
        ll.addFirst("Manik");
        ll.addLast("Barad");
        ll.printList();
        System.out.println();
        ll.removeFirst();
        ll.printList();
        System.out.println();
        ll.removeLast();
        System.out.println();
        ll.printList();
    }
}
