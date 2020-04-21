/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author MaNa
 */

import java.util.*;

public class Main {
   public static void main(String args []){
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter a value for Radius");
       int v1 = input.nextInt();
       
       Circle c1 = new Circle(v1);
       c1.findArea();
       
   } 
}
