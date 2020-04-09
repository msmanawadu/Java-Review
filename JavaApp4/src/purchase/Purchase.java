/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;

/**
 *
 * @author MaNa
 */
public class Purchase {
    static int availableQty = 50;
    
     int update(int purchasingQty){
        availableQty = availableQty - purchasingQty;
        return availableQty;
    }
     
     void display(int updatedAvailQty){
         System.out.println("Available Quantity = " + updatedAvailQty);
     }
     
}
