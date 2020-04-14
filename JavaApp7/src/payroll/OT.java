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
    
    double hoursWorked;
    double hourRate;
    
    OT(double hWorked, double hRate){
        hoursWorked = hWorked;
        hourRate = hRate;
    }
    
    double findOT(){
        double OTAmt = hoursWorked * hourRate;
        return OTAmt;
    }
    
}

