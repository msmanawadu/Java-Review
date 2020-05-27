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
public class MyStack {
    public static void main(String args []){
        //create an instance of Stack class
        Stack<String> stack1 = new Stack<>();
        
        System.out.println("Empty Stack : " + stack1);
        System.out.println("Empty Stack : " + stack1.isEmpty());
        String sAdd;
        
        sAdd = stack1.push("a");
        System.out.println("Added value to the stack : " + sAdd);
        
        sAdd = stack1.push("b");
        System.out.println("Added value to the stack : " + sAdd);
        
        sAdd = stack1.push("c");
        System.out.println("Added value to the stack : " + sAdd);
        
        System.out.println("Stack Size : " + stack1.size());
        
        System.out.println("Stack's Top / Peek element : " + stack1.peek());
        
        while(!stack1.empty()){
            System.out.println("Stack Pop : " + stack1.pop());
        }
    }
}
