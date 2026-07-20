/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
import javax.swing.tree.*;
public class JTreeExample {
    public static void main(String args[]) {
        JFrame frame=new JFrame("College Hierarchy");
        frame.setSize(500,500);
        
        DefaultMutableTreeNode college=new DefaultMutableTreeNode("College");
        DefaultMutableTreeNode cse=new DefaultMutableTreeNode("CSE");
        DefaultMutableTreeNode it=new DefaultMutableTreeNode("IT");
        DefaultMutableTreeNode aids=new DefaultMutableTreeNode("AI & DS");
        DefaultMutableTreeNode cse_fy=new DefaultMutableTreeNode("FY");
        DefaultMutableTreeNode cse_sy=new DefaultMutableTreeNode("SY");
        DefaultMutableTreeNode cse_ty=new DefaultMutableTreeNode("TY");
        DefaultMutableTreeNode it_fy=new DefaultMutableTreeNode("FY");
        DefaultMutableTreeNode it_sy=new DefaultMutableTreeNode("SY");
        DefaultMutableTreeNode it_ty=new DefaultMutableTreeNode("TY");
        DefaultMutableTreeNode aids_fy=new DefaultMutableTreeNode("FY");
        DefaultMutableTreeNode aids_sy=new DefaultMutableTreeNode("SY");
        DefaultMutableTreeNode aids_ty=new DefaultMutableTreeNode("TY");
        
        cse.add(cse_fy);
        cse.add(cse_sy);
        cse.add(cse_ty);
        
        it.add(it_fy);
        it.add(it_sy);
        it.add(it_ty);
        
        aids.add(aids_fy);
        aids.add(aids_sy);
        aids.add(aids_ty);
        
        college.add(cse);
        college.add(it);
        college.add(aids);
        
        JTree j1=new JTree(college);
        
        frame.add(j1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
