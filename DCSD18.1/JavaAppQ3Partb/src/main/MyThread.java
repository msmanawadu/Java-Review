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
    int total = 0;
    
    
    @Override
    public void run(){
        for(int i = 5; i <= 50; i++){
            if(i%6 == 0){
                total = total + i;
                System.out.println(i);
            }
        }
        System.out.println("Total - " + total);
    }
}
