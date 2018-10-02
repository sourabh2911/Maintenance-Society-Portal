
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class CheckLogin extends UnicastRemoteObject implements LoginInterface{
    public CheckLogin()throws Exception{}
    @Override
    public boolean check(String userId, String password) {
        //throw new UnsupportedOperationException("Not supported yet.");
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/msportal","root","sourabh");
           PreparedStatement ps=con.prepareStatement("select * from adminlogin where aid=? and password=?");
           ps.setString(1, userId);
           ps.setString(2, password);
           ResultSet rs=ps.executeQuery();
           if(rs.next())
               return true;
           else
               return false;
       } catch(ClassNotFoundException|SQLException ex){
           ex.printStackTrace();
           return false;
       }
        
    }
    
    
    
}
