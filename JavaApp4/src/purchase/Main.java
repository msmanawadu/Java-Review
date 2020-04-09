/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;

/**
 *
 * @author MaNa
 */

import java.util.*;

public class Main {
    public static void main(String args []){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Purchasing Qunatity ");
        int v1 = input.nextInt();
        
        Purchase p1 = new Purchase();
        int qty1 = p1.update(v1);
        p1.display(qty1);
        
        System.out.print("Enter Purchasing Qunatity ");
        int v2 = input.nextInt();
        
        Purchase p2 = new Purchase();
        int qty2 = p2.update(v2);
        p2.display(qty2);
        
    }
}
