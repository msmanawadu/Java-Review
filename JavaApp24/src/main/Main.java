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
        
        A threadA = new A();
        threadA.setPriority(Thread.MAX_PRIORITY);
        threadA.start();
        
        B threadB = new B();
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadB.start();
    }
}
