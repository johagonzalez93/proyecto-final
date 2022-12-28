/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author johag
 */
public class SociosDAO 
{
    Connection conexion;
    
          
        public SociosDAO() throws ClassNotFoundException
        {
            Conexion con=new Conexion();
            conexion=con.getConnection();

        }
        
    
        
        public List<Socios> listarSocios()
        {
            PreparedStatement ps;
            ResultSet rs;
            
            
            List<Socios> lista=new ArrayList<>();
            
            try
            {
                ps=conexion.prepareStatement("select * from socio");
                rs=ps.executeQuery(); 
                
                while(rs.next())
                {
                    int id=rs.getInt("id");
                    String nombre=rs.getString("nombre");
                    String apellido=rs.getString("apellido");
                    String direccion=rs.getString("direccion");
                    String localidad=rs.getString("localidad");
                    LocalDate fnac=rs.getDate("fnac").toLocalDate();
                    String email=rs.getString("email");
                    String telefono=rs.getString("telefono");
                    boolean activo=rs.getBoolean("activo");
                    
                    
                    Socios s1=new Socios(id,nombre,apellido,direccion,localidad,fnac,email,telefono,activo);
                    lista.add(s1);
                }
                
            }
            catch(SQLException e)
            {
                System.out.println(e);
               
            }
                return lista;

        }
        
        public Socios mostrarSocio(int _id)
        {
            PreparedStatement ps;
            ResultSet rs;
            
            Socios s1=null;
           
            
            try
            {
                ps=conexion.prepareStatement("select * from socio where id=?");
                ps.setInt(1, _id);
                rs=ps.executeQuery(); 
                
                 while(rs.next())
                {
                    int id=rs.getInt("id");
                    String nombre=rs.getString("nombre");
                    String apellido=rs.getString("apellido");
                    String direccion=rs.getString("direccion");
                    String localidad=rs.getString("localidad");
                    LocalDate fnac=rs.getDate("fnac").toLocalDate();
                    String email=rs.getString("email");
                    String telefono=rs.getString("telefono");
                    boolean activo=rs.getBoolean("activo");
                                        
                    s1=new Socios(id,nombre,apellido,direccion,localidad,fnac,email,telefono,activo);
                   
                }
                 return s1;
            }
            catch (SQLException e)
            {
                System.out.println(e);
                return null;
                
            }
            
        }



public boolean insertarSocios(Socios s1)

{
    PreparedStatement ps;
try
    {
    ps=conexion.prepareStatement("insert into socio (nombre,apellido,direccion,localidad,fnac,email,telefono,activo) values (?,?,?,?,?,?,?,?)");
    ps.setString(1, s1.getNombre());
    ps.setString(2, s1.getApellido());
    ps.setString(3, s1.getDireccion());
    ps.setString(4, s1.getLocalidad());
    ps.setObject(5, s1.getFnac());
    ps.setString(6, s1.getEmail());
    ps.setString(7, s1.getTelefono());
    ps.setBoolean(8, true);
    ps.execute();
    return true;
    }
        catch(SQLException e)
        {
        System.out.println(e);
        return false;

        }   
    }

 public boolean eliminarSocio(int _id)
    {
        PreparedStatement ps;
        try
        {
            ps=conexion.prepareStatement("delete from socio where id=?");
            ps.setInt(1, _id);
            ps.execute();
            return true;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return false;
            
        }
    }

public boolean actualizarSocios(Socios s1)

{
    PreparedStatement ps;
try
    {
    ps=conexion.prepareStatement("update socio set nombre=?,apellido=?,direccion=?,localidad=?,fnac=?,email=?,telefono=?,activo=? where id=?");
    ps.setString(1, s1.getNombre());
    ps.setString(2, s1.getApellido());
    ps.setString(3, s1.getDireccion());
    ps.setString(4, s1.getLocalidad());
    ps.setObject(5, s1.getFnac());
    ps.setString(6, s1.getEmail());
    ps.setString(7, s1.getTelefono());
    ps.setBoolean(8, s1.isActivo());
    ps.setInt(9, s1.getId());
    ps.execute();
    return true;
    }
        catch(SQLException e)
        {
        System.out.println(e);
    return false;

        }   
    }
}