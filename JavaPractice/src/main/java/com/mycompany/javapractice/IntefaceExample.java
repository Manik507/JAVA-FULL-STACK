/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author Admin
 */
interface Engine
{
    String BRAND="Toyota";
    void startEngine();
    default void fuelType()
    {
        System.out.println("Petrol engine");
    }
}
interface VehicleGPS
{
    void navigate();
}
interface Entertainment
{
    void playMusic();
}
interface SmartSystem extends Entertainment, VehicleGPS
{
    void connectBluetooth();
}
interface Security
{
    default void  alarm()
    {
        System.out.println("Security alarm Activated");
    }
}
interface AdvancedVehicle extends Engine,SmartSystem,Security
{
    void autoPark();
}
class SmartCar implements AdvancedVehicle
{
    
    public void startEngine()
    {
        System.out.println("Engine Started");
    }
    public void  navigate()
    {
        System.out.println("Navigated Successfully");
    }
    public void playMusic()
    {
        System.out.println("Music Played");
    }
    public void connectBluetooth()
    {
        System.out.println("Bluetooth  Connected Successfully");
    }
    public void autoPark()
    {
        System.out.println("Vehicle Auto Parked");
    }
    @Override
    public void alarm()
    {
        System.out.println("Alarm Override");
    }
    void display()
    {
        System.out.println("Brand = "+BRAND);
    }
}
interface InterfaceA
{
    default void show()
    {
        System.out.println("A");
    }
}

interface InterfaceB
{
    default void show()
    {
        System.out.println("B");
    }
}
interface C extends InterfaceA, InterfaceB
{
    @Override
    default void show()
    {
        InterfaceA.super.show();
    }
}
class DefaultHandler implements C
{
}
public class IntefaceExample {
    public static void main(String args[]) {
        AdvancedVehicle av=new SmartCar();
        av.startEngine();
        av.fuelType();
        av.navigate();
        av.playMusic();
        av.connectBluetooth();
        av.alarm();
        av.autoPark();  
        
        SmartCar c1=new SmartCar();
        c1.display();
        
        DefaultHandler d=new DefaultHandler();
        d.show();
    }
}
