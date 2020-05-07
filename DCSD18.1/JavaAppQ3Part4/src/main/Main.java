/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args []){
        
        int[] N = new int[2];
        N[0] = 5;
        N[1] = 0;
        
        try{
            int A = N[0] / N[1];
        }
        catch(ArithmeticException e){
            System.out.println("Sorry, Cannot devide by zero !");
        }
    }
}
