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
        int[] intArray = new int[3];
        
        try{
        intArray[0] = 50;
        intArray[1] = 100;
        intArray[2] = 500;
        
        intArray[3] = 500;
        System.out.println(intArray[3]);
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry, the array is out of bounds");
        }
    }
}
