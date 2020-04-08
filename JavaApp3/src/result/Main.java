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
public class Main {
    public static void main(String args []){
        
        Result r1 = new Result();
        int v1 = r1.multiply(2, 2);
        r1.display(v1);
        
        int v2 = r1.multiply(3, 3, 3);
        r1.display(v2);
        
    }
}
