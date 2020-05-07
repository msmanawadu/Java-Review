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
        LuxuryVehicle v1 = new LuxuryVehicle("V2390", 2000, 10, 10);
        v1.calculateBill();
        v1.display();
    }
}
