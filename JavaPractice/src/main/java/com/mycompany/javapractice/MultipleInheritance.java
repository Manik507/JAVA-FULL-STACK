/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
interface Camera
{
    void takePhoto();
}
interface MusicPlayer 
{
    void playMusic();
}
interface GPS
{
    void navigate();
}
class SmartPhone implements Camera, MusicPlayer, GPS
{
    public void takePhoto()
    {
        System.out.println("Photo Taken");
    }
    public void playMusic()
    {
        System.out.println("Music Started");
    }
    public void navigate()
    {
        System.out.println("Navigating");
    }
}
public class MultipleInheritance {
    public static void main(String args[]) {
        SmartPhone p=new SmartPhone();
        p.takePhoto();
        p.playMusic();
        p.navigate();
    }
}
