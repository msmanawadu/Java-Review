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
    
    private final int radius;
    private double area;
    
    public Circle(int r){
        radius = r;
    }
    
    public void findArea(){
       area = pi * radius * radius;
       display();
    }
    
    public void display(){
        System.out.println("Area = " + area + " units");
    }
}
