/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill;

/**
 *
 * @author MaNa
 */
public class Bill {
    
    static int billNumber;
    double unitPrice;
    int qty;
    
    void setData(int x, double y, int z){
        billNumber = x;
        unitPrice = y;
        qty = z;
        
        calculateBill();
    }
    
    void calculateBill(){
        double total = unitPrice * qty;
        displayBill(total);  
    }
    
    void displayBill(double billTotal){
    System.out.println("Total Bill Amount = " + billTotal); 
    }

}
