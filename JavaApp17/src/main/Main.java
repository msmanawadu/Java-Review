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
        int[] intArray = new int[2];
        
        try{
            System.out.println("Enter 1st value");
            intArray[0] = input.nextInt();
            System.out.println("Enter 2nd vlaue");
            intArray[1] = input.nextInt();
            
            int answer = intArray[0] / intArray[1];
            System.out.println("Answer = " + answer);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry, the array is out of bounds");
        }
        catch(ArithmeticException e){
            System.out.println("oops! Cannot devide by Zero");
        }
        
       
    }
}
