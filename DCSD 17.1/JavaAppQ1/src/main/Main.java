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
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Customer Name");
        String name = input.nextLine();
        System.out.println("Enter Customer Code");
        int code = input.nextInt();
        System.out.println("Enter number of units consumed");
        int units = input.nextInt();
        
        int unitCharge = 5;
        double taxRate = 0.02;
        
        int billAmount = units * unitCharge;
        double taxAmount = billAmount * taxRate;
        
        double totalBillAmount = billAmount + taxAmount;
        System.out.println("Total Bill Amount = " + totalBillAmount);
    
    }
}
