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
public class Customer {
    
    int currentBalance;
    int withdrawalAmount;
    
    Customer(int cBalance, int wAmount){
        currentBalance = cBalance;
        withdrawalAmount = wAmount;
        
        System.out.println("Withdrawal Amount - " + withdrawalAmount);
    }
}
