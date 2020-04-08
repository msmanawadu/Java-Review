/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result;

import java.util.Scanner;
/**
 *
 * @author MaNa
 */
public class Main {
        
    static int v1,v2,v3;
    static Scanner input;  
        
    public static void main(String args []) {
        
        functionWrap();
        Result r1 = new Result();
        int result1 = r1.multiply(v1, v2);
        r1.display(result1);
        
        functionWrap();
        System.out.println("Enter 3rd value ");
        v3 = input.nextInt();
        
       
        int result2 = r1.multiply(v1, v2, v3);
        r1.display(result2);
        
    }
    
    static void functionWrap() {
        
        input = new Scanner(System.in);
        System.out.println("Enter 1st value ");
        v1 = input.nextInt();
        
        System.out.println("Enter 2nd value ");
        v2 = input.nextInt();
                            }
}
