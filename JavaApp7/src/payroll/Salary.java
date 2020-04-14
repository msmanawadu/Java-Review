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
public class Salary extends OT{
    
    int salaryNumber;
    double basicSalary;
    double salaryAmount;
    
    Salary(double hWorked, double hRate, int sNumber, double bSalary){
    super(hWorked, hRate); 
    salaryNumber = sNumber;
    basicSalary = bSalary;
    }
    
    void findSalary(double OTValue){
    salaryAmount = OTValue + basicSalary;
    
    System.out.println("Salary Number - " + salaryNumber);
    System.out.println("Salary Amount = " + salaryAmount);
    }
        
}
