/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author joe 92
 */
public class LibroDAO {

   public LibroBean selectSingleLibro (String usuario); 
    public LinkedList selectlibros() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        LinkedList lista = new LinkedList();
        try {
            conn = utils.Conexion.getConexion();
            stmt = conn.createStatement();
            String query = "select * from libro";

            System.out.println(query);
            rs = stmt.executeQuery(query);


            while (rs.next()) {
                lista.add(new LibroBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));

            }
            

        } catch (SQLException ex) {
// handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
// it is a good idea to release
// resources in a finally{} block
// in reverse-order of their creation
// if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                } // ignore
                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return lista;
    }

    public boolean insertlibro(LibroBean bean) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        boolean result = false;
        
        try {
            conn = utils.Conexion.getConexion();
            stmt = conn.createStatement();
            String query = "INSERT INTO `evidencia`.`libro` (` Nombre Libro`, `Tipo Libro`, `Autor`, `Editorial`, `Codigo`) "
                    + "VALUES ('" +bean.getNombrelibro() +"', '" +bean.getTipodelibro() +"', '" +bean.getAutor() +"', '" +bean.getEditorial() +"', '" +bean.getCodigo() +"')";


            System.out.println(query);
            //"INSERT INTO `evidencia`.`clientes` (`usuario`, `contrasena`, `nombre`, `email`, `direccion`) 
            //VALUES ('prueba', 'uno', 'eos', 'tres', 'cuatri');
            stmt.execute(query);
            
            int count = stmt.getUpdateCount();
            if(count>0) result = true;
            
        } catch (SQLException ex) {
// handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
// it is a good idea to release
// resources in a finally{} block
// in reverse-order of their creation
// if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                } // ignore
                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    void actualizaLibro(LibroBean libro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }

   
       
  
   

    

