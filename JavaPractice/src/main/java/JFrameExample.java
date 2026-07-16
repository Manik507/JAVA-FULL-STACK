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
        JLabel j1=new JLabel("Created a Button with image");
        
        b1.setBounds(100,100,200,200); //x,y,w,h
        j1.setBounds(100,70,200,20);
        
        frame.add(b1);
        frame.add(j1);
        
        frame.setVisible(true); //Can be viewed
    }
}
