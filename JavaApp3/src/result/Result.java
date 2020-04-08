/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result;

/**
 *
 * @author MaNa
 */
public class Result {
    
    void multiply(int x, int y, int z){
        int result = x * y * z;
        System.out.println("Multiplication of 3 numbers = " + result);
    }
    
    void multiply(int x, int y){
        int result = x * y;
        System.out.println("Multiplication of 2 numbers = " + result);
    }
}
