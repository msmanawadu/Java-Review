/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill;

/**
 *
 * @author MaNa
 */

import java.util.*;

public class Main {
    public static void main(String args []) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Bill Number ");
        int v1 = input.nextInt();
        System.out.println("Enter Unit price ");
        double v2 = input.nextDouble();
        System.out.println("Enter quantity ");
        int v3 = input.nextInt();
        
        Bill b1 = new Bill();
        double ans1 = b1.calculateTotal();
        b1.display(ans1);
        
        Bill b2 = new Bill(v1, v2, v3);
        double ans2 = b2.calculateTotal();
        b2.display(ans2);
    }
}
