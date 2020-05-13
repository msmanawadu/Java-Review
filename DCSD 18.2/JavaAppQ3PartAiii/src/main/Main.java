/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter value");
        try{
            int x = Integer.parseInt(System.console().readLine());
            System.out.println("value - " + x);
        }
        catch(NullPointerException e){
            System.out.println("cannot enter a string value");
        }
    }
}
