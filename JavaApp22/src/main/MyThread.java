/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.lang.Thread;
/**
 *
 * @author MaNa
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                try{
                    sleep(3000); // puts the thread instance to blocked state
                } catch(Exception e){
                    System.out.println("Thread enters the blocked state for 3 seconds");
                }
            }
            System.out.println(i);
        }
    }
}
