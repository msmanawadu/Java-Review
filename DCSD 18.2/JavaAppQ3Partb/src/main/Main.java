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
        MyThread t1 = new MyThread();
        t1.setName("Thread1");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }    
}
