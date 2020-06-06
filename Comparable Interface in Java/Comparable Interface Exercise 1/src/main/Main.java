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
public class Main {
    public static void main(String args []){
        //create an instance of ArrayList
        ArrayList<Student> list = new ArrayList<>();
        
        //add new instances of Student to the list
        list.add(new Student("Rainy", "Kandy", 1005, 7655654));
        list.add(new Student("Windy", "Matara", 1003, 7764534));
        list.add(new Student("Ashanthi", "Colombo", 1007, 78876543));
        list.add(new Student("Sanuka", "Gampaha", 1002, 77645678));
        list.add(new Student("Dumal", "Kaluthara", 10010, 76546781));
        
        //invoking the sorting method
        Collections.sort(list);
        
        //display sorted student objects
        System.out.println("Student Objects after sorting \n");
        for(Student student : list){
            System.out.println("Student Index - " + student.getIndexNumber());
            System.out.println("Student Name - " + student.getStudentName());
            System.out.println("Student Address - " + student.getStudentAddress());
            System.out.println("Student Phone Number - " + student.getPhoneNumber());
            System.out.println("----------------------------------");
        }
    }
}
