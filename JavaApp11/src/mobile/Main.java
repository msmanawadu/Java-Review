/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile;

/**
 *
 * @author MaNa
 */

import java.util.*;

public class Main {
    
    public static void main(String args []){
        
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter Unit Price");
       int v1 = input.nextInt();
       
       System.out.println("Enter Units Consumed");
       int v2 = input.nextInt();
        
       Mobile m1 = new Mobile();
       m1.calculate(v1, v2);
       
    }
}
