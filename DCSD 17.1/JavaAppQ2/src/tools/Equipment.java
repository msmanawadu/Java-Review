/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author MaNa
 */
public class Equipment {
    protected double rentCharge;
    protected double totalAmount;
    
    Equipment(double rCharge){
        rentCharge = rCharge;
    }
    
    public void calculate(){
        totalAmount = rentCharge;
    }
    
    public void display(){
        System.out.println("Total Amount - " + totalAmount);
    }
}
