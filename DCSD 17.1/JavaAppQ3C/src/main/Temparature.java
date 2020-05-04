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
public class Temparature extends Thread{
    @Override
    public void run(){
        
        Double[] tempArray = new Double[10];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i <= tempArray.length - 1; i++){
            System.out.println("Enter Temparature Value - ");
            tempArray[i] = input.nextDouble();
        }
        
        double sum = 0.0;
        
        for(int i = 0; i <= tempArray.length - 1; i++){
            sum = sum + tempArray[i];
        }
        
        double average = sum / tempArray.length;
        System.out.println("Average Temparature - " + average);
    }
}
