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
        int[] intArray = new int[5];
        
        for(int i = 0; i <= intArray.length - 1; i++){
            System.out.println("Enter a value - ");
            intArray[i] = input.nextInt();
        }
        
        for(int i = 0; i <= intArray.length - 1; i++){
            System.out.println(intArray[i]);
        }
    }
}
