/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente;

import com.cliente.Comando;
import com.cliente.ComandoException;
import com.cliente.clienteBean;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Mario 
 */

public class clienteCMD implements Comando { 

    private String vista;

   

    public clienteCMD() {
    }

    public clienteCMD(String vista) {
        this.vista = vista;
    }

    public String ejecuta (HttpServletRequest req) throws ComandoException {
        String fwd = vista;
        String acc = req.getParameter("acc");
        if (acc == null) {
            //muestra pantalla
        } else if(acc.equals("guardar")){
        //hace algo
              String usuario = req.getParameter("usuario");
              String contraseña = req.getParameter("contrasena");
              String nombre = req.getParameter("nombre");
              String email = req.getParameter("email");
              String direccion = req.getParameter("direccion");

              clienteBean cleinte = new clienteBean (usuario,contraseña,nombre,email,direccion);
              req.setAttribute("cliente", cleinte);
              clienteDAO dao = new clienteDAO();
                  dao.insertCliente(cleinte);
              fwd = "respuestajsp.jsp";
        } else if (acc.equals("consulta")) {
                clienteDAO dao = new clienteDAO ();
                LinkedList lista = dao.selectclientes();
                req.setAttribute("lista", lista);
                fwd = "respuestajsp.jsp";
        } else if (acc.equals("actualizaLoad")){
            String clave = req.getParameter("clave");
           clienteDAO dao = new clienteDAO ();
            clienteBean bean = dao.selectSingleCliente(clave);
            req.setAttribute("bean", bean);
         fwd = "actualiza.jsp";
        }else if (acc.equals("actualizaSave")){
            String usuario = req.getParameter("usuario");
            String contrasena = req.getParameter("contrasena");
            String nombre = req.getParameter("nombre");
            String email = req.getParameter("email");
            String direccion = req.getParameter("direccion");
            
            clienteBean cliente = new clienteBean(usuario, contrasena, nombre, email, direccion);
            clienteDAO dao = new clienteDAO();
            dao.actualizaCliente(cliente);
            req.setAttribute("cliente", cliente);
            
         fwd = "respuestajsp.jsp";

        }
        //envia a pagina 
        return fwd;
        
       //dentro de ejecuta
       

   
        
    }

 
    }




