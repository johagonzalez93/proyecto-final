/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author johag
 */
public class Socios {
    
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String localidad;
    private LocalDate fnac;
    private String email;
    private String telefono;
    private boolean activo;
    

    public Socios(int id,String nombre,String apellido,String direccion,String localidad,LocalDate fnac,String email,String telefono,Boolean activo)
    {
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.localidad=localidad;
        this.fnac=fnac;
        this.email=email;
        this.telefono=telefono;
        this.activo=activo;
    }

    public Socios(int id, String nombre, String apellido, String direccion, String localidad, LocalDate fnac, String email, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFnac() {
        return fnac;
    }

    public void setFnac(LocalDate fnac) {
        this.fnac = fnac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    

   
}
