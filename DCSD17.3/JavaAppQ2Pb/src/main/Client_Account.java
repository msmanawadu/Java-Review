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
public class Client_Account {
    
    private double interestRate;
    private double accountBalance;
    private double monthlyInterest;
    
    public Client_Account(double iRate, double aBalance){
        interestRate = iRate;
        accountBalance = aBalance;
    }
    
    public void calculateAndDisplayMonthlyInterest(){
        monthlyInterest = (double) (interestRate * accountBalance) / 12;
        System.out.println("Monthly Interest Amount - " + monthlyInterest);
    }
    
    
}
