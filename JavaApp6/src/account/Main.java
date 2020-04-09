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
public class Main {
    public static void main(String args []){ 
        
        Account.setInterestRate(0.75);
        
        double intRate = Account.getInterestRate();
        System.out.println("Interest Rate - " + intRate);
    }
        
}
