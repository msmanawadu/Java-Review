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
    
    int multiply(int x, int y, int z){
        int result = x * y * z;
        return result;
    }
    
    int multiply(int x, int y){
        int result = x * y;
        return result;
    }
    
    void display(int ans){
        System.out.println("Multiplication = " + ans);
    }
}
