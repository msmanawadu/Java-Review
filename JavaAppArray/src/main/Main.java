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
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        
        //declared and initialized an integer array
        int[] intArray = new int[10];
        
        //storing elements into array
        for(int i = 0; i <= intArray.length-1; i++){
            System.out.print("Enter an integer value - ");
            intArray[i] = input.nextInt();
        }
        
        //printing all the elements stored in the array
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }    
    }
}
