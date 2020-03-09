/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.util.Scanner;
/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args[]){
       
       Scanner x = new Scanner(System.in);
       System.out.print("Enter employee type ");
       int empType = x.nextInt();
       
       System.out.print("Enter number of OT hours ");
       double OTHours = x.nextDouble();
       
       if(empType == 1){
           System.out.println( 15000 + 250*OTHours);
       }
       else{
           System.out.println( 10000 + 100*OTHours);
       }
    }
}
