/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
public class JTableExample {
    public static void main(String args[]) {
        JFrame frame=new JFrame("Tables");
        frame.setSize(500,500);
        frame.setLayout(null);
        
        String columns[]={"ID","Name","Salary"};
        String data[][]={
            {"1","ABC","50000"},
            {"2","LMN","10000"},
            {"3","XYZ","20000"}
        };
        
        JTable tb1=new JTable(data,columns);
        tb1.setBounds(30,50,300,400);
        
        
        frame.add(tb1);
        frame.setVisible(true);
    }
}
