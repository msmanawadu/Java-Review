/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MaNa
 */
public class Vehicle {
    protected String vehicleCode;
    protected double dailyRentCharge;
    protected int numberOfDays;
    
    protected double totalBillAmount;
    
    Vehicle(String vCode, double dRentCharge, int nOfDays){
        vehicleCode = vCode;
        dailyRentCharge = dRentCharge;
        numberOfDays = nOfDays;
    }
    
    public void calculateBill(){
       totalBillAmount = dailyRentCharge * numberOfDays;
    }
    
    public void display(){
        System.out.println("Vehicle Code - " + vehicleCode);
        System.out.println("Total Bill Amount - "+ totalBillAmount);
    }
}
