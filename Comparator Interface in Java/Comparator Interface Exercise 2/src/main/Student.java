/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**no need to implement an interface by this class. Only the Comparator class needs to 
 *implement the Comparator interface.
 * @author MaNa
 */
public class Student {
    
    //private instance variables
    private String studentName;
    private int studentAge;
    private int studentIndex;
    
    //parameterized constructor method
    public Student(String studentName, int studentAge, int studentIndex){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentIndex = studentIndex;
    }
    
    //getter methods for accessing private instance variables
    public String getStudentName(){
        return studentName;
    }
    
    public int getStudentAge(){
        return studentAge;
    }
    
    public int getStudentIndex(){
        return studentIndex;
    }
    
    //overriding the toString() method of the Object super class by the Student sub class
    @Override
    public String toString(){
        return "Student [Name - " + studentName + ", Age - " + studentAge + ", Index - " + 
                studentIndex + "]";
    }
}
