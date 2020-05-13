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
        doStuff();
    }
    
    static void doStuff(){
        try{
            doMoreStuff();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        
    }
    
    static void doMoreStuff(){
        int x = 5/0;
        System.out.println(x);
    }
}
