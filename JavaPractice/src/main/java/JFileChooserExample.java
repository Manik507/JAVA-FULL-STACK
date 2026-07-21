/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
public class JFileChooserExample {
    public static void main(String args[]) {
        JFrame frame=new JFrame("Student File Manager");
        frame.setSize(500,350);
        ImageIcon icon=new ImageIcon("C:\\Users\\Admin\\Pictures\\Screenshots\\hi.png");
        frame.setIconImage(icon.getImage());
        
        JFileChooser jf1=new JFileChooser();
        jf1.setDialogTitle("Select Student File");
        jf1.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jf1.setMultiSelectionEnabled(true);
        jf1.setApproveButtonText("Choose File");
        jf1.setApproveButtonToolTipText("Select this file");
        jf1.showOpenDialog(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
