/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import studentinfo.*;
import java.util.*;
/**
 *
 * @author MaNa
 */
public class School {
    
    public static void main(String args []){    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Student Name");
        String name = input.nextLine();
        
        System.out.println("Enter Student Number");
        int number = input.nextInt();
        
        System.out.println("Enter Student Marks");
        int mark = input.nextInt();
      
        Student s1 = new Student();
        s1.showData(number, name);
        
        Result r1 = new Result();
        r1.getResult(mark);
    }
}
