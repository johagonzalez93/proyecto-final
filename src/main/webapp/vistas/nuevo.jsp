

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    
    </head>
    <body  background="vistas/img/fondo.jpg">
        
        <div class="container" >
            <h1 class="lead display-4 text-center" >Añadir Alumno</h1>
                <div class="row" >
                    <form class="p-4" method="POST" action="SociosController?accion=insertar">
                        <div class="mb-2">
                            <label for="nombre" class="form-label fw-bolder" style="color: white;background: black">Nombre</label>
                            <input type="text" class="form-control" id="nombre" name="nombre">                          
                        </div> 
                        <div class="mb-2">
                            <label for="apellido" class="form-label fw-bolder" style="color: white;background: black">Apellido</label>
                            <input type="text" class="form-control" id="apellido" name="apellido">                          
                        </div> 
                         <div class="mb-2">
                            <label for="direccion" class="form-label fw-bolder" style="color: white;background: black">Dirección</label>
                            <input type="text" class="form-control" id="direccion" name="direccion">                          
                        </div> 
                         <div class="mb-2">
                            <label for="localidad" class="form-label fw-bolder" style="color: white;background: black">Localidad</label>
                            <input type="text" class="form-control" id="localidad" name="localidad">                          
                        </div> 
                          <div class="mb-2">
                            <label for="fnac" class="form-label fw-bolder" style="color: white;background: black">Fecha Nac</label>
                            <input type="date" class="form-control" id="fnac" name="fnac">                          
                        </div> 
                        <div class="mb-2">
                            <label for="email" class="form-label fw-bolder" style="color: white;background: black">E-Mail</label>
                            <input type="text" class="form-control" id="email" name="email">                          
                        </div>  
                        <div class="mb-2">
                            <label for="telefono" class="form-label fw-bolder" style="color: white;background: black">Teléfono</label>
                            <input type="text" class="form-control" id="telefono" name="telefono">                          
                        </div>                
                                               
                        <button type="submit" class="btn btn-dark col-4 m-4 position-absolute end-0">Añadir </button>
                        
                    </form>                
                </div>
            
            
            
            
            
            
            
        </div>
        
        
        
        
        
        
        
        
        
    </body>
</html>