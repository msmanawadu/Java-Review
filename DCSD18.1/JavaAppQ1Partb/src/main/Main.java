/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        Double[] loanAmount = new Double[100];
        Double[] interestRate = new Double[100];
        
        for(int i = 0; i <= 99; i++){
            System.out.println("Enter Loan Amount");
            loanAmount[i] = input.nextDouble();
            System.out.println("Enter Annual Interest Rate");
            interestRate[i] = input.nextDouble();
        }
        
        double totalInterestAmount = 0.0;
                
        for(int i = 0; i <= 99; i++){
            double interestAmount = loanAmount[i] * interestRate[i];
            totalInterestAmount = totalInterestAmount + interestAmount;
        }
        System.out.println("Total Interest Amount - " + totalInterestAmount);
    }
}
