/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;

/**
 *
 * @author MaNa
 */
class Result {
    
    public void getResult(int marks){
        if(marks < 50){
            System.out.println("Result - Fail");
        } else {
            System.out.println("Result - Pass");
        }
    }
}
