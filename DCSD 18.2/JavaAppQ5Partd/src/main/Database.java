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
    Statement st;   
    
public void set(){
        try{
            Class.forName("sun.jdbc.odbc.jdbcodbcDriver");
            String su = new String("jdbc:odbc:Hotel");
            con = DriverManager.getConnection(su,"admin","");
            st = con.createStatement();
        }
        catch(Exception e){}   
    }

public void submit(){
        try{
            st.executeUpdate("insert into Room(Room_ID,ROOM_TYPE) value(20, 'Luxury')");
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

public void search(){
        try{
            ResultSet rs = st.executeQuery("select * from Room");
            while(rs.next()){
                System.out.println(rs.getString(1) + " ");
                System.out.println(rs.getString(2) + " ");
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
