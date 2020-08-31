/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente;

/**
 *
 * @author Mario 
 */


public class clienteBean {

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContrasena() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContrasena(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String usuario;
    private String contraseña;
    private String email;
    private String direccion;
    private String nombre;

    public clienteBean(String usuario, String contraseña, String email, String direccion, String nombre) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.email = email;
        this.direccion = direccion;
        this.nombre = nombre;
    }
    
    public String toString () {
        return getNombre() + "" + getUsuario() + "" + getEmail();
        
    }

    
}
