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
public class Vehicle {
    
    private final int distanceTravelled;
    private final double timeConsumed;
    private double speed;
    
    Vehicle(int distance, double time){
       distanceTravelled  = distance;
       timeConsumed = time;
    }
    
    public void findSpeed(){
        speed = distanceTravelled / timeConsumed;
        displaySpeed(speed);
    }
    
    public void displaySpeed(double calcSpeed){
        System.out.println("Speed = " + speed + " kmph");
    }
    
}
