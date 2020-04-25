/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amount;

import static info.Number.price;

/**
 *
 * @author MaNa
 */
public class Bill {
    public void calculateBill(int qty){
        int billAmount = price * qty;
        System.out.println("Bill Amount = " + billAmount);
    }
}
