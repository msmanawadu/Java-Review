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
public class RainFall extends Thread{
    @Override
    public void run(){
        Double[] rainFallArray = new Double[10];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i <= rainFallArray.length - 1; i++){
            System.out.println("Enter Rainfall Value - ");
            rainFallArray[i] = input.nextDouble();
        }
        
        double sum = 0.0;
        
        for(int i = 0; i <= rainFallArray.length - 1; i++){
            sum = sum + rainFallArray[i];
        }
        
       double average  = sum / rainFallArray.length;
       System.out.println("Average Rainfall - " + average);
    }
}
