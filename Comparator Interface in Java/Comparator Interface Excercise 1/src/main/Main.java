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
    public static void main(String args[]){
        //create an instance of ArrayList
        ArrayList<Student> list = new ArrayList<>();
        
        //add new instances of Student to the list
        list.add(new Student("Stephanie", 19, 1005));
        list.add(new Student("Sanuka", 21, 1003));
        list.add(new Student("Ashanthi", 11, 1008));
        list.add(new Student("Dumal", 20, 1009));
        list.add(new Student("Rainy", 24, 1002));
        
        //invoking to sort students by student age
        Collections.sort(list, new AgeComparator());
        
        //display the sorted student objects
        System.out.println("Student Objects after sorting in age \n");
        for(Student student : list){
            System.out.println("Student Age - " + student.getStudentAge());
            System.out.println("Student Name - " + student.getStudentName());
            System.out.println("Student Index - " + student.getStudentIndex());
            System.out.println("------------------------------");
        }
        
        //invoking to sort students by student name
        Collections.sort(list, new NameComparator());
        
        //display the sortyed student objects
        System.out.println("Student Objects after sorting in names \n");
        for(Student student : list){
            System.out.println("Student Name - " + student.getStudentName());
            System.out.println("Student Age - " + student.getStudentAge());
            System.out.println("Student Index - " + student.getStudentIndex());
            System.out.println("------------------------------");
        }
    }
}
