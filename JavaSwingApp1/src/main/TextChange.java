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
public class TextChange extends JFrame implements ActionListener {
    
    private JLabel l1;
    private JButton btn1, btn2;
    private JPanel p1, p2;
    
    TextChange(){
        super("Button Action");
        
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        
        l1 = new JLabel("Watch Text Change");
        
        btn1 = new JButton("Change");
        btn2 = new JButton("Exit");
        
        p1.add(l1);
        p2.add(btn1);
        p2.add(btn2);
        
        content.add(p1, BorderLayout.NORTH);
        content.add(p2, BorderLayout.SOUTH);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
        setSize(450,500);
        show();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == btn1){
            l1.setText("Hello World");
        }
        
        if(e.getSource() == btn2){
            System.exit(0);
        }
    }
    
}
