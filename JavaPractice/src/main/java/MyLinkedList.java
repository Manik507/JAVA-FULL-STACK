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
    
    public static void main(String args[]) {
        MyLinkedList ll=new MyLinkedList();
        ll.addFirst("Manik");
    }
}
