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
public class ElectricEquipment extends Equipment{
    private double serviceCharge;
    
    ElectricEquipment(double rCharge, double sCharge){
        super(rCharge);
        serviceCharge = sCharge;
    }
    
    @Override
    public void calculate(){
        totalAmount = rentCharge + serviceCharge;
    }
    
}
