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
public class B extends Thread{
    @Override
    public void run(){
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
    }
}
