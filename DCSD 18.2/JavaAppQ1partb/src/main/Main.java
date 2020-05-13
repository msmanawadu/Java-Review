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
        
        System.out.println("Enter Customer Type");
        int customerType = input.nextInt();
        
        System.out.println("Enter Bill Amount");
        double billAmount = input.nextDouble();
        
        double discountedBillAmount;
        
        if(customerType == 1){
            double discountAmount = billAmount * 0.05;
            discountedBillAmount = billAmount - discountAmount;
            System.out.println("Discounted Bill Amount - " + discountedBillAmount);
        }else{
            double discountAmount = billAmount * 0.08;
            discountedBillAmount = billAmount - discountAmount;
            System.out.println("Discounted Bill Amount - " + discountedBillAmount);
        }
    }
}
