/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
public class StudentForm {
    public static void main(String args[]) {
        JFrame frame=new JFrame("Student Form");
        JLabel name=new JLabel("Name");
        JTextField tf1=new JTextField(100);
        JLabel gender=new JLabel("Gender");
        ButtonGroup bg=new ButtonGroup();
        JRadioButton male=new JRadioButton("Male");
        JRadioButton female=new JRadioButton("Female");
        bg.add(male);
        bg.add(female);
        JLabel skills=new JLabel("Skills");
        JCheckBox java=new JCheckBox("Java");
        JCheckBox python=new JCheckBox("Python");
        JCheckBox c = new JCheckBox("C++");
        JLabel course=new JLabel("Course");
        String courses[]={"BCA","BSc IT","B. Tech","MCA"};
        JComboBox<String> cb=new JComboBox<>(courses);
        JButton submit=new JButton("Submit");
        
        name.setBounds(0,0,70,30);
        tf1.setBounds(0,30,150,30);
        gender.setBounds(0,60,70,30);
        male.setBounds(0,90,70,30);
        female.setBounds(0,120,70,30);
        skills.setBounds(0,150,70,30);
        java.setBounds(0,180,70,30);
        python.setBounds(0,210,70,30);
        c.setBounds(0,240,70,30);
        course.setBounds(0,270,70,30);
        cb.setBounds(0,300,120,30);
        submit.setBounds(0,340,100,30);
        
        frame.add(name);
        frame.add(tf1);
        frame.add(gender);
        frame.add(male);
        frame.add(female);
        frame.add(skills);
        frame.add(java);
        frame.add(python);
        frame.add(c);
        frame.add(course);
        frame.add(cb);
        frame.add(submit);
        
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,350);
        frame.setVisible(true);
    }
}
