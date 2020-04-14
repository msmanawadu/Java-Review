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
    double salaryAmount;
    
    void findSalary(int sNumber, double OTValue, double bSalary){
       salaryNumber = sNumber;
       salaryAmount = OTValue + bSalary;   
    }
    
    void display(){
       System.out.println("Salary Number = " + salaryNumber);
       System.out.println("Salary Amount = " + salaryAmount); 
    }
        
}
