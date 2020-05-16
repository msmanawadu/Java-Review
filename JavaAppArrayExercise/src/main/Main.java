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
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int intArray[] = {1,2,3,4,5};
        
        
//        for(int i = 0; i < intArray.length; i++){
//            System.out.println("Enter integer value");
//            intArray[i] = input.nextInt();
//        }

 
        
        intArray[5] = 6;

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
