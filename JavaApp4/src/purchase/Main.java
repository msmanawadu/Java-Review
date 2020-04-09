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
public class Main {
    public static void main(String args []){
        
        Purchase p1 = new Purchase();
        int qty1 = p1.update(5);
        p1.display(qty1);
        
        Purchase p2 = new Purchase();
        int qty2 = p2.update(15);
        p2.display(qty2);
        
    }
}
