/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author MaNa
 */

import java.util.*;

public class Main {
    public static void main(String args []){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter distance travelled - ");
        int value1 = input.nextInt();
        
        System.out.println("Enter time consumed - ");
        double value2 = input.nextDouble();
        
        Vehicle v1 = new Vehicle(value1, value2);
        v1.findSpeed();
    }
}
