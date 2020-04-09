/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author MaNa
 */
public class Account {
    
    static double interestRate;
    
    static void setInterestRate(double iRate){
        interestRate = iRate;
    }
    
    static double getInterestRate(){
        return interestRate;
    }
    
}
