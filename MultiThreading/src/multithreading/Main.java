/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args[]){
        MyThread threadA = new MyThread();
        threadA.start();
    }
}