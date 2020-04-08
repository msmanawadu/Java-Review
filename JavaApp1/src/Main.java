/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaNa
 */

import java.util.*;

public class Main {

public static void main(String args []) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a value for width");
    int v1 = input.nextInt();
    System.out.println("Enter a value for height");
    int v2 = input.nextInt();
    
    Rectangle r1 = new Rectangle();
    r1.setData(v1, v2);
    int result = r1.calculateArea();
    r1.display(result);
    
}
                  }
