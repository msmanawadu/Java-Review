/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args []){
        
        double sum = 0.0;
        double totalOTAmount = 0.0;
        double totalPayment = 0.0;
        
        Scanner input = new Scanner(System.in);
        
        Double[] basicSalary = new Double[100];
        Double[] oTHours = new Double[100];
        Double[] hourCharge = new Double[100];
        
        for(int i = 0; i <= 99; i++){
            System.out.println("Enter Basic Salary");
            basicSalary[i] = input.nextDouble();
            
            System.out.println("Enter Number of OT Hours");
            oTHours[i] = input.nextDouble();
            
            System.out.println("Enter per hour charge");
            hourCharge[i] = input.nextDouble(); 
        }
        
        for(int i = 0; i <= basicSalary.length - 1; i++){
          sum = sum + basicSalary[i];
        }
        
        for(int i = 0; i <= 99; i++){
            double OTCharge = oTHours[i] * hourCharge[i];
            totalOTAmount = OTCharge + totalOTAmount;
        }
        
        totalPayment = sum + totalOTAmount;
        
        System.out.println("Total Payment Done - " + totalPayment);
    }
}
