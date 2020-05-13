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
public class Furniture extends Product{
    private double discountRate;
    private double discountAmount;
    
    Furniture(int pCode, double pPrice, double dRate){
        super(pCode, pPrice);
        discountRate = (double) dRate / 100;
    }
    
    @Override
    public void calculateBill(){
        discountAmount = productPrice * discountRate;
        discountedPrice = productPrice - discountAmount;
    }
}
