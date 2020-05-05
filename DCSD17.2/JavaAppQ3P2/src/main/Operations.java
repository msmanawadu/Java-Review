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
public class Operations {
    
    public void calculate(){
        int a = 5;
        int b = 6;
        
       int c = a * b;
       System.out.println(c);
    }
    
    public void calculate(int v1){
        int a = v1;
        int b = a * 6;
        System.out.println(b);
    }
    
    public void calculate(int v1, int v2){
        int a = v1 * v2;
        System.out.println(a);
    }
}
