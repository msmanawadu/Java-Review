/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill;

/**
 *
 * @author MaNa
 */
public class Main {
    public static void main(String args []) {
    
        Bill b1 = new Bill();
        b1.setData(790, 25.40, 2);
        double ans = b1.calculateArea();
        b1.display(ans);
        
    }
}
