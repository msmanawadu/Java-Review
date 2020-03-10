/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.util.Scanner;
/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       int counter = 0, index = 0, marks = 0, total = 0;
       
       while(counter < 10){
           System.out.println("Enter index");
           index = input.nextInt();
           System.out.println("Enter marks");
           marks = input.nextInt();
           total = total + marks;
           counter++;
       }
       double avg = total/10;
       System.out.println("Average marks " + avg);
    }
       }
