/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilebill;

/**
 *
 * @author MaNa
 */
public class Mobile implements Getter{
    
    private int unitPrice;
    private int unitsConsumed;
    private int billAmount;
    
    @Override
    public void calculate() {
        billAmount = unitPrice * unitsConsumed; 
    }

    @Override
    public void set(int x, int y) {
        unitPrice = x;
        unitsConsumed = y; 
    }
    
    @Override
    public void display(){
        System.out.println("Bill Amount = " + billAmount);
    }
    
}
