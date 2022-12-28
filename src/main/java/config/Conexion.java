/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author johag
 */
public class Conexion 
{
    public String driver="com.mysql.cj.jdbc.Driver";
    private Object driverManager;
    
    
    
    public Connection getConnection()
    {
        Connection conexion=null;
        
        try
        {
            Class.forName(driver);
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud22547","root"," ");
        }
        catch(ClassNotFoundException|SQLException e)
        {
            System.out.println(e);
        }
        return conexion;
    }
    
    public static void main (String[] args) throws SQLException
    {
        Connection conexion=null;
        Conexion con=new Conexion();
        conexion=con.getConnection();
        
        PreparedStatement ps;
        ResultSet rs;
        
        ps=conexion.prepareStatement("select * from socio");
                
        rs=ps.executeQuery();
        
        while(rs.next())
        {
            int id=rs.getInt("id");
            String nombre=rs.getString("nombre");
            System.out.println("ID: "+id+" "+nombre);
        }
    }
}
