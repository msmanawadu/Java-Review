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
public class Main {
    public static void main(String args []){
        
        Temparature temparatureThread = new Temparature();
        temparatureThread.setName("Temparature Thread");
        temparatureThread.setPriority(Thread.MAX_PRIORITY);
        temparatureThread.start();
        
        RainFall rainFallThread = new RainFall();
        rainFallThread.setName("Rainfall Thread");
        rainFallThread.setPriority(Thread.MIN_PRIORITY);
        rainFallThread.start();
    }
}
