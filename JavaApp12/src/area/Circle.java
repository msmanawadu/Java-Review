/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author MaNa
 */
public class Circle implements Shape{
    
    public void findArea(int radius){
       double area = pi * radius * radius;
       display(area);
    }
    
    public void display(double a){
        System.out.println("Area = " + a + " units");
    }
}
