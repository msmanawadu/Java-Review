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
        int[] array = new int[3];
            try{
                array[0] = 1;
                array[1] = 2;
                array[2] = 3;
                
                array[3] = 4;
                
          System.out.println("There are 3 elements in the array");
        } 
            catch(ArrayIndexOutOfBoundsException e){
            System.out.println("oops ! the array is out of bounds");
        }
       
    }
}
