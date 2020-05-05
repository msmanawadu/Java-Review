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
public class Bank_Officer {
    
    public Bank_Officer(){
        Client_Account cA1 = new Client_Account(0.1,10000);
        cA1.calculateAndDisplayMonthlyInterest();
    }
}
