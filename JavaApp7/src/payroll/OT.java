/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author MaNa
 */
public class OT {
    
    double findOT(double wHours, double hRate){
        double OTAmt = wHours * hRate;
        return OTAmt;
    }
}

