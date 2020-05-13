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
public class EPFUI extends JFrame implements ActionListener{
    private JLabel l1,l2,l3,l4;
    private JComboBox cmb1;
    private JTextField tf1;
    private JButton btn1;
    private JPanel p1,p2;
    
    private double ePFRate = 0.0;
    private double basicSalary = 0.0;
    private double amount = 0.0;
    String EPFAmount;
    String text1;
    
    EPFUI(){
        super("Calculate EPF");
        
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(3,2));
        
        btn1 = new JButton("Calculate");
        
        tf1 = new JTextField();
        
        cmb1 = new JComboBox();
        cmb1.addItem("1");
        cmb1.addItem("2");
        
        l1 = new JLabel("Employee Type");
        l2 = new JLabel("Basic Salary");
        l3 = new JLabel("EPF Amount");
        l4 = new JLabel("/=");
        
        p1.add(btn1);
        
        p2.add(l1);
        p2.add(cmb1);
        p2.add(l2);
        p2.add(tf1);
        p2.add(l3);
        p2.add(l4);
        
        content.add(p1, BorderLayout.SOUTH);
        content.add(p2, BorderLayout.CENTER);
        
        btn1.addActionListener(this);
        
        setSize(450,550);
        show();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            
            String select = (String) cmb1.getSelectedItem();
            int selection = Integer.parseInt(select);
            
            if(selection == 1){
               ePFRate = 0.05; 
               text1 = tf1.getText();
               basicSalary = Double.parseDouble(text1);
               amount = basicSalary * ePFRate;
               EPFAmount = Double.toString(amount);
               l4.setText(EPFAmount);
               
            } else {
               ePFRate = 0.07; 
               text1 = tf1.getText();
               basicSalary = Double.parseDouble(text1);
               amount = basicSalary * ePFRate;
               EPFAmount = Double.toString(amount);
               l4.setText(EPFAmount);
            } 
        }
    
    }  
}
