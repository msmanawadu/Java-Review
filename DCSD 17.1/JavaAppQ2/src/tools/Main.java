/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args []){
        ElectricEquipment X = new ElectricEquipment(250.25,150.50);
        X.calculate();
        X.display();
    }
}
