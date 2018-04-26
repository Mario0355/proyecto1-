/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente;

import com.cliente.clienteBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import utils.Conexion;

/**
 *
 * @author Raymundo Jimenez
 */
public class clienteDAO {
    private LinkedList lista = new LinkedList();
    
    public LinkedList insertcliente1(clienteBean bean) {
        
        lista.add(new clienteBean("12301", "juan", "jime nez", "ids", "722 12345"));
        lista.add(new clienteBean("12302", "ray", "jime nez", "ids", "722 12345"));
        lista.add(new clienteBean("12303", "sara", "martinez", "lem", "722 12345"));
        lista.add(new clienteBean("12304", "juana", "diz", "lae", "722 12345"));
        lista.add(new clienteBean("12305", "pepe", "bastida", "lht", "722 12345"));
        return lista;
    }
     public boolean insertCliente(clienteBean bean){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        boolean result = false;
        
        try {
            conn = Conexion.getConexion();
            stmt = conn.createStatement();
            String query = "INSERT INTO `evidencia`.`clientes` (`usuario`, `contraseña`, `nombre`, `email`, `direccion`) "
                            + "VALUES ('"+bean.getUsuario()+"', '"+bean.getContrasena()+"', '"+bean.getNombre()+"', '"+bean.getEmail()+"', '"+bean.getDireccion()+"')";

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
    public LinkedList selectclientes() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        LinkedList lista = new LinkedList();
        try {
            conn = Conexion.getConexion();
            stmt = conn.createStatement();
            String query = "select * from clientes";

            System.out.println(query);
            rs = stmt.executeQuery(query);


            while (rs.next()) {
                clienteBean temp = new clienteBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),"");
                //clienteBean temp = new clienteBean("uno","uno","uno","onu","onu");
                lista.add(temp);

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
    public clienteBean selectSingleCliente(String usuario) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        clienteBean bean = null;
        try {
            conn = Conexion.getConexion();
            stmt = conn.createStatement();
            String query = "select * from clientes where usuario='"+usuario+"'";

            System.out.println(query);
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                                bean= new clienteBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),"");
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
        return bean;
    }
    
    public boolean actualizaCliente(clienteBean bean){
        boolean result=false;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = Conexion.getConexion();
            stmt = conn.createStatement();
            String query = "UPDATE `evidencia`.`clientes` SET "
                    + "`contrasena`='"+bean.getContrasena()+"', "
                    + "`email`='"+bean.getEmail()+"', "
                    + "`direccion`='"+bean.getDireccion()+"' "
                    + "WHERE `usuario`='"+bean.getUsuario()+"'";
            System.out.println(query);
 
            stmt.execute(query);
            if(stmt.getUpdateCount()>0) result = true;
            
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
    
    
}
