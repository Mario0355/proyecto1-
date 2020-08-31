/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente;

import com.cliente.Comando;
import com.cliente.ComandoException;
import com.cliente.LibroBean;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Mario
 */
public class LibroCMD implements Comando{


    private String vista;

   


    public LibroCMD(String vista) {
        this.vista = vista;
    }

    public String ejecuta (HttpServletRequest req) throws ComandoException {
        String fwd = vista;
        String acc = req.getParameter("acc");
        if (acc == null) {
            //muestra pantalla
        } else if(acc.equals("guardar")){
        //hace algo
        String nombrelibro = req.getParameter("Nombre Libro");
        String tipolibro = req.getParameter("Tipo de Libro");
        String autor = req.getParameter("Autor");
        String editorial = req.getParameter("Editorial");
        String codigo = req.getParameter("Codigo");
        
        LibroBean libro = new LibroBean (nombrelibro,tipolibro,autor,editorial,codigo);
        req.setAttribute("libro", libro);
        LibroDAO dao = new LibroDAO();
            dao.insertlibro(libro);
        fwd = "respuestalibro.jsp";
        } else if (acc.equals("consulta")) {
          LibroDAO dao = new LibroDAO ();
          LinkedList lista = dao.selectlibros();
          req.setAttribute("lista", lista);
          fwd = "respuestalibro.jsp";
        } else if (acc.equals("actualizaLoad")){
            String clave = req.getParameter("clave");
            LibroDAO dao = new LibroDAO ();
            LibroBean bean = dao.selectSingleLibro(clave);
            req.setAttribute("bean", bean);
         fwd = "actualizalibro.jsp";
        }else if (acc.equals("actualizaSave")){
            String nombrelibro = req.getParameter("nombrelibro");
            String tipolibro = req.getParameter("tipolibro");
            String autor = req.getParameter("autor");
            String editorial = req.getParameter("editorial");
            String codigo = req.getParameter("codigo");
            
            LibroBean libro = new LibroBean(nombrelibro, tipolibro, autor, editorial, codigo);
            LibroDAO dao = new LibroDAO();
            dao.actualizaLibro(libro);
            req.setAttribute("libro", libro);
            
         fwd = "actualizalibro.jsp";

        }
        //envia a pagina 
        return fwd;
        
       //dentro de ejecuta
       

   
        
    }

 
    }
    

