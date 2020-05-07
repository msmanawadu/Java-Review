/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author MaNa
 */
public class CalculateTaxUI extends JFrame implements ActionListener{
    
    private JLabel l1,l2,l3;
    private JTextField tf1;
    private JButton btn1;
    private JPanel p1,p2;
    
    double taxRate = 0.05;
   
    CalculateTaxUI(){
        super("Calculate Tax Amount");
        
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(2,2));
        
        l1 = new JLabel("Basic Salary");
        l2 = new JLabel("Tax Amount");
        l3 = new JLabel("/=");
        
        tf1 = new JTextField();
        
        btn1 = new JButton("Calculate");
        
        p1.add(btn1);
        
        p2.add(l1);
        p2.add(tf1);
        p2.add(l2);
        p2.add(l3);
        
        content.add(p1, BorderLayout.SOUTH);
        content.add(p2, BorderLayout.CENTER);
        
        btn1.addActionListener(this);
        
        setSize(450,550);
        show();
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            String text1 = tf1.getText();
            double basicSalary = Double.parseDouble(text1);
            
            double tAmount = basicSalary * taxRate;
            String taxAmount = Double.toString(tAmount);
            l3.setText(taxAmount);
        } 
    }
    
}
