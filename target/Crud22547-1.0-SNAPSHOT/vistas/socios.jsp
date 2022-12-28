<%-- 
    Document   : socios
    Created on : 20/12/2022, 10:30:15
    Author     : johag
--%>

<%@page import="modelo.SociosDAO"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Socios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/b8e7e9786e.js" crossorigin="anonymous"></script>
        
    </head>
    <body>
        
         <div>
        <h1 class="lead display-3 text-center">¡Bienvenidos!</h1>
               
               
        <img style="width: 350px; height: 350px; margin-left: 36%" src="vistas/img/logogym.jpg">
        </div>
       
        <h1 class="lead display-6 text-decoration-underline text-center">Listado de Socios del Gym</h1>
        
                      
                <table class="table table-primary">
                    <thead>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Dirección</th>
                        <th>Localidad</th>
                        <th>Fecha de nacimiento</th>
                        <th>Email</th>
                        <th>Teléfono</th>
                        <th>Modificar</th>
                        <th>Eliminar</th>
                                    
                    </thead>
                    
                    <%
                        List<Socios> resultado=null;
                        SociosDAO s1=new SociosDAO();
                        resultado=s1.listarSocios();
                        
                        for(int x=0;x<resultado.size();x++)
                        {
                          String ruta="SociosController?accion=modificar&id="+resultado.get(x).getId();
                          String rutaE="SociosController?accion=eliminar&id="+resultado.get(x).getId();

                     %>
                    <tr>
                        <td><%=resultado.get(x).getId()%></td>
                        <td><%=resultado.get(x).getNombre()%></td>
                        <td><%=resultado.get(x).getApellido()%></td>
                        <td><%=resultado.get(x).getDireccion()%></td>
                        <td><%=resultado.get(x).getLocalidad()%></td>
                        <td><%=resultado.get(x).getFnac()%></td>
                        <td><%=resultado.get(x).getEmail()%></td>
                        <td><%=resultado.get(x).getTelefono()%></td>
                        <td class="text-center"><a href=<%=ruta%>><i class="fa-solid fa-arrow-up"></i></a></td>
                        <td class="text-center"><a href=<%=rutaE%>><i class="fa-solid fa-circle-xmark"></i></i></a></td>
                        
                        
                    </tr>
                    <%
                      }
                    %>
                </table>
                
                 <div class="container">
            <div class="row">   
                <a class="btn btn-primary col-4 m-4 position-absolute end-0" href="SociosController?accion=nuevo">Agregar Socio</a>
            </div>
            
                  
       
    </body>
</html>

