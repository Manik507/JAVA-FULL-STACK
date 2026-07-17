/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
public class JFrameExample {
    public static void main(String args[]) {
        JFrame frame=new JFrame("My First Frame"); //Frame title
        frame.setSize(300,400); //Frame's width and height
        frame.setLayout(null); //No layout applied
        
        JButton b1=new JButton(new ImageIcon("C:\\Users\\Admin\\Pictures\\Screenshots\\hi.png"));
        JButton b2=new JButton("Submit");
        
        JLabel j1=new JLabel("Enter Gmail - ");
        JLabel j2=new JLabel("Enter Password - ");
        JLabel j3=new JLabel("Enter Information About Yourself - ");
        
        JTextField t1=new JTextField();               
        JPasswordField p1=new JPasswordField(); 
        JTextArea ta1=new JTextArea();
      
        j1.setBounds(50,50,300,30);
        t1.setBounds(50,75,200,30);
        j2.setBounds(50,100,300,30);
        p1.setBounds(50,125,200,30);
        j3.setBounds(50,150,300,30);
        ta1.setBounds(50,175,400,40);
        b2.setBounds(50,220,100,30);
        
        frame.add(j1);
        frame.add(t1);
        frame.add(j2);
        frame.add(p1);
        frame.add(j3);
        frame.add(ta1);
        frame.add(b2);
        
        frame.setVisible(true); //Can be viewed
    }
}
