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
public class MultipleCalculations implements CalNum{
    
    int sum;
    double avg;
    int difference;
    
    @Override
    public void sum(int a, int b){
       sum = a + b;
       System.out.println("Sum - " + sum);
    }

    @Override
    public void avg() {
        avg = (double) sum / 2;
        System.out.println("Average - " + avg);
    }

    @Override
    public void difference(int a, int b) {
        difference = a - b;
        System.out.println("Difference - " + difference);
    }
    
}
