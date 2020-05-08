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
public class MyThread extends Thread{
    int intArray[] = {};
    int total = 0;
    
    @Override
    public void run(){
        for(int i = 100; i<= 200; i++){
            if(i%10 == 0){
                System.out.println("Value - " + i);
                total = total + i;
            }
        }
        System.out.println("Total - " + total);
    }
}
