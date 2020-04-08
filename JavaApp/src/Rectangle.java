/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaNa
 */

class Rectangle {
    int width;
    int height;
    
    void setData(int x, int y){
         width = x;
         height = y;
    }
    
    int calculateArea(){
     int area = width * height; 
     return area;
    }
    
    void display(int z) {
        System.out.println("Area in units = " + z);
    }
    
}

