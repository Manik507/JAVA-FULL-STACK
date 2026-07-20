/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
public class MenuBarExercise {
    public static void main(String args[]) {
        JFrame frame=new JFrame("College Management Menu");
        frame.setSize(500,500);
        JMenuBar mb=new JMenuBar();
        
        JMenu file=new JMenu("File");
        JMenu student=new JMenu("Student");
        JMenu faculty=new JMenu("Faculty");
        JMenu help=new JMenu("Help");
        
        JMenuItem i1=new JMenuItem("New");
        JMenuItem i2=new JMenuItem("Open");
        JMenuItem i3=new JMenuItem("Save");
        JMenuItem i4=new JMenuItem("Exit");
        
        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        mb.add(file);
        
        JMenuItem i5=new JMenuItem("Add Student");
        JMenuItem i6=new JMenuItem("Search Student");
        JMenuItem i7=new JMenuItem("Update Student");
        JMenuItem i8=new JMenuItem("Delete Student");
        
        student.add(i5);
        student.add(i6);
        student.add(i7);
        student.add(i8);
        mb.add(student);
        
        JMenuItem i9=new JMenuItem("Add Faculty");
        JMenuItem i10=new JMenuItem("View Faculty");
        
        faculty.add(i9);    
        faculty.add(i10);
        mb.add(faculty);
        
        JMenuItem i11=new JMenuItem("About");
        help.add(i11);
        mb.add(help);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(mb);
        frame.setVisible(true);
    }
}
