/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Socios;
import modelo.SociosDAO;

/**
 *
 * @author johag
 */
public class SociosController extends HttpServlet {

    public SociosController()
    {
        super();
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        SociosDAO sociosDAO=null;
        try
        {
        sociosDAO=new SociosDAO();
        }
        catch (ClassNotFoundException e)
        {
        }
       
        
        String accion;
        RequestDispatcher dispatcher=null;
              
        
        accion=request.getParameter("accion");
        
        if (accion==null||accion.isEmpty())
        {
           
            dispatcher=request.getRequestDispatcher("vistas/socios.jsp");
        }
        else if(accion.equals("modificar"))
        {
            dispatcher=request.getRequestDispatcher("vistas/modificar.jsp");
        }
        else if(accion.equals("actualizar"))
        {
                int id=Integer.parseInt(request.getParameter("id"));
                String nombre=request.getParameter("nombre");
                String apellido=request.getParameter("apellido");
                String direccion=request.getParameter("direccion");
                String localidad=request.getParameter("localidad");
                LocalDate fnac=LocalDate.parse(request.getParameter("fnac"));
                String email=request.getParameter("email");
                String telefono=request.getParameter("telefono");
                
                Socios s1=new Socios(id,nombre,apellido,direccion,localidad,fnac,email,telefono,true);
                sociosDAO.actualizarSocios(s1);
                dispatcher=request.getRequestDispatcher("vistas/socios.jsp");
                
        }
        else if(accion.equals("eliminar"))
        {
            int id=Integer.parseInt(request.getParameter("id"));
            sociosDAO.eliminarSocio(id);
            dispatcher=request.getRequestDispatcher("vistas/socios.jsp");
        }
        else if(accion.equals("nuevo"))
        {
            dispatcher=request.getRequestDispatcher("vistas/nuevo.jsp");
        }
        else if(accion.equals("insertar"))
        {
            String nombre=request.getParameter("nombre");
            String apellido=request.getParameter("apellido");
            String direccion=request.getParameter("direccion");
            String localidad=request.getParameter("localidad");
            LocalDate fnac=LocalDate.parse(request.getParameter("fnac"));
            String email=request.getParameter("email");
            String telefono=request.getParameter("telefono");
            Socios s1=new Socios(0,nombre,apellido,direccion,localidad,fnac,email,telefono,true);
            sociosDAO.insertarSocios(s1);
            dispatcher=request.getRequestDispatcher("vistas/socios.jsp");

        }
        
        
        dispatcher.forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
      doGet(request,response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
