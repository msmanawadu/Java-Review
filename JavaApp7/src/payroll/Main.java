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
        Salary s1 = new Salary();
        OTAmount = s1.findOT(2.5, 150.50);
        s1.findSalary(1001, OTAmount, 10000);
        
        Salary s2 = new Salary();
        OTAmount = s2.findOT(3.8, 155.89);
        s2.findSalary(1002, OTAmount, 12000);
    }
}
