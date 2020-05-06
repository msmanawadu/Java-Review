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
public class BillUI extends JFrame implements ActionListener{
    
    private JLabel l1,l2,l3;
    private JTextField tf1,tf2,tf3;
    private JButton btn1;
    private JPanel p1,p2;
    
    BillUI(){
        super("Generate Bill");
        
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(3,2));
        
        l1 = new JLabel("Bill Amount");
        l2 = new JLabel("Discount Rate");
        l3 = new JLabel("Final Bill Amount");
        
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        tf3 = new JTextField(10);
        
        btn1 = new JButton("Calculate");
        
        p1.add(btn1);
        
        p2.add(l1);
        p2.add(tf1);
        p2.add(l2);
        p2.add(tf2);
        p2.add(l3);
        p2.add(tf3);
        
        content.add(p2, BorderLayout.CENTER);
        content.add(p1, BorderLayout.SOUTH);
        
        btn1.addActionListener(this);
        
        setSize(450, 550);
        show();    
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == btn1){
           
           String text1 = tf1.getText();
           String text2 = tf2.getText();
           
           double billAmount = Double.parseDouble(text1);
           double dRate = Double.parseDouble(text2);
           
           double discountRate = (double) dRate / 100;
         
           double discountAmount = billAmount * discountRate;
           
           double finalBillAmount = billAmount - discountAmount;
           
           String payAmount = Double.toString(finalBillAmount);
           
           tf3.setText(payAmount);
        }
    
    
    }
    
}
