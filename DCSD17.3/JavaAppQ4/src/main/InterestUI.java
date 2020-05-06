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
public class InterestUI extends JFrame implements ActionListener{
    
    private JLabel l1, l2;
    private JTextField tf1;
    private JButton btn1;
    private JPanel p1,p2;
    
    double interestRate = 0.15;
    
    InterestUI(){
        
        super("Calculate Interest");
        
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        
        l1 = new JLabel("Loan Amount");
        l2 = new JLabel("/=");
        
        tf1 = new JTextField();
        
        btn1 = new JButton("Calculate");
        
        p1.add(l1);
        p1.add(tf1);
        
        p2.add(btn1);
        p2.add(l2);
        
        content.add(p1, BorderLayout.NORTH);
        content.add(p2, BorderLayout.CENTER);
        
        btn1.addActionListener(this);
        
        setSize(450,500);
        show();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == btn1){
            String text1 = tf1.getText();
            double loanAmount = Double.parseDouble(text1);
            double iAmount = loanAmount * interestRate;
            
            String interestAmount = Double.toString(iAmount);
            l2.setText(interestAmount);
        }
    }
    
}
