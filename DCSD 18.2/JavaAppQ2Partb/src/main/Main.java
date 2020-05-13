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
public class Main {
    public static void main(String args []){
        Furniture f1 = new Furniture(1564,10000,10);
        f1.calculateBill();
        f1.display();
    }
}
