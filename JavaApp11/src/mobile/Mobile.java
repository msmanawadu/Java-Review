/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile;

/**
 *
 * @author MaNa
 */
public class Mobile implements Bill{
    
    private int BillAmount;
    
    @Override
    public void calculate(int x, int y) {
        
        BillAmount = x * y;
        display(BillAmount);
    }
    
    public void display(int BAmount){
        System.out.println("Bill Amount = " + BillAmount);
    }
    
}
