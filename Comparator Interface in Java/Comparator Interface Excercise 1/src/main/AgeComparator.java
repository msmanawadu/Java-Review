/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;

/**this AgeComparator class needs to implement the Comparator interface and override the  
 *compare() method. 
 * @author MaNa
 */
public class AgeComparator implements Comparator<Student>{
    
    //sorting of student objects based on ascending order of ages
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getStudentAge() - student2.getStudentAge();
    }
}
