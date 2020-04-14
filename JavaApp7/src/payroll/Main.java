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
public class Main {
    public static void main(String args []){
        
        double OTAmount;
        
        Salary s1 = new Salary(2.4, 150.78, 1000, 12000);
        OTAmount = s1.findOT();
        s1.findSalary(OTAmount);
        
        Salary s2 = new Salary(3.8, 190.63, 1002, 10000);
        OTAmount = s2.findOT();
        s2.findSalary((int)OTAmount);
    }
}
