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
       System.out.println("Enter Customer Name ");
       String cName = x.nextLine();
       
       System.out.println("Enter Customer Number ");
       int cNumber = x.nextInt();
       
       System.out.println("Enter number of points ");
       double points = x.nextDouble();
       
       System.out.println("Customer Name: " + cName);
       System.out.println("Customer Number: " + cNumber);
       System.out.println("Number of Points: " + points);
    }
}
