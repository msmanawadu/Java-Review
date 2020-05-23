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
public class MyArrayList {
    public static void main(String args []){
        ArrayList<String> list = new ArrayList<>(); //creating the ArrayList instance
        
        list.add("Sajani"); //adding String objects into the ArrayList instance
        list.add("Sithumini");
        list.add("Sithara");
        list.add("Udari");
        list.add("Omesha");
        
        //Traversing the list through Iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
