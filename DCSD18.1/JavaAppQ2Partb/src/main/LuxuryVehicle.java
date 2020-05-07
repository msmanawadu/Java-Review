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
public class LuxuryVehicle extends Vehicle{
   private double taxRate;
   private double taxAmount;
   
   LuxuryVehicle(String vCode, double dRentCharge, int nOfDays, double tRate){
       super(vCode, dRentCharge, nOfDays);
       taxRate = (double) tRate / 100;
   }
   
   @Override
   public void calculateBill(){
      taxAmount = dailyRentCharge * taxRate;
      double rentAmount = dailyRentCharge * numberOfDays;
      totalBillAmount = rentAmount + taxAmount;
   }
}
