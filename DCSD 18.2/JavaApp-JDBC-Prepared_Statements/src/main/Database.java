/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.*;
/**
 *
 * @author MaNa
 */
public class Database {
    Connection con;
    
    public void set(){
        try{
            Class.forName("sun.jdbc.odbc.jdbcodbcDriver");
            String su = new String("jdbc:odbc:UNIVERSITY");
            con = DriverManager.getConnection(su, "admin", "");
        }
        catch(Exception e){}
    }
    
    public void submit(){
        try{
            PreparedStatement pst = con.prepareStatement("insert into Student(SID,SNAME) values(?,?)");
            
            int no[] = {1,5};
            String name[] = {"Sandy","Windy"};
            
            for(int i = 0; i<2; i++){
                pst.setInt(1, no[i]);
                pst.setString(2, name[i]);
                pst.executeUpdate();
            }
            con.close();
        }
        catch(Exception e){}
    }
    
    public void search(){
        try{
            PreparedStatement pst = con.prepareStatement("select * from Student");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                int no = rs.getInt("SID");
                String name = rs.getString("SNAME");
                System.out.println(no + name);
            }
            con.close();
        }
        catch(Exception e){}
    }
}
