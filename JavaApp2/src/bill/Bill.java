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
    
    void setData(int x, double y, int z){
        billNumber = x;
        unitPrice = y;
        qty = z; 
    }
    
    double calculateArea(){
    double total = unitPrice * qty;
    return total;
    }
    
    void display(double a){
    System.out.println("Total is = " + a);
    }
        
}
