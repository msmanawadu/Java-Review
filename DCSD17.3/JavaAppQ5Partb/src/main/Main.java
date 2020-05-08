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
        String s1 = new String("ABPQXY");
        String s2 = s1.replace("A","B");
        System.out.println(s2);
        
        int i = s1.indexOf('Q');
        System.out.println(i);
    }
}
