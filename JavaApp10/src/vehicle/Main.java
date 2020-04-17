/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args []){
        
        Vehicle v1 = new Vehicle(500,2.5);
        v1.findSpeed();
        
        Vehicle v2 = new Vehicle(400,5);
        v2.findSpeed();
    }
}
