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
    
    int billNumber;
    double unitPrice;
    int qty;
    
    //default constructor method
    Bill(){
        billNumber = 1000;
        unitPrice = 250.4;
        qty = 2;
    }
    
    //parameterized constructor method
    Bill(int x, double y, int z){
        billNumber = x;
        unitPrice = y;
        qty = z;
    }
    
    
    double calculateTotal (){
    double total = unitPrice * qty;
    return total;
    }
    
    void display(double a){
    System.out.println("Total is = " + a);
    }
        
}
