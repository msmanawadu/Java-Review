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
        
        System.out.println("Enter product price");
        double price = input.nextDouble();
        System.out.println("Enter discount percentage");
        int percentage = input.nextInt();
        
        double discountPercentage = (double) percentage / 100;
               
        double discountAmount = price * discountPercentage;
        double discountPrice = price - discountAmount;
        
        System.out.println("Discount Amount - " + discountAmount);
        System.out.println("Discount Price - " + discountPrice);
    }
}
