
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mario
 */
public class AdminServlet extends HttpServlet {

    private HashMap comandos = null;
    private final String jsp = "/jsp/";
    private String error = "error.jsp";

    private void iniciaComandos() {
        comandos = new HashMap();
        comandos.put("error", "/jsp/error.jsp");
        comandos.put("cliente", new clienteCMD("index.html"));
        comandos.put("libro", new LibroCMD("libro.html"));
        
 
        
        
        //comandos.put("profesor", new ProfesorCMD(jsp + "profesor.jsp"));
    }

    public void init() {
        iniciaComandos();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try {
            String cmd = (String) req.getParameter("cmd");
            String siguiente = "";
            RequestDispatcher dispatcher;
            Comando cm = buscaComando(cmd);
            siguiente = cm.ejecuta(req);
            dispatcher = req.getRequestDispatcher(siguiente);
            dispatcher.forward(req, resp);
        } catch (ServletException se) {
            se.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void processRequestt(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String next;
        try {
            Comando cmd = buscaComando(req.getParameter("cmd"));
            next = cmd.ejecuta(req);
        } catch (ComandoException e) {
            req.setAttribute("exception", e);
            next = error;
        }
        RequestDispatcher rd;
        rd = getServletContext().getRequestDispatcher(jsp + next);
        rd.forward(req, resp);
        
//        RequestDispatcher view = request.getRequestDispatcher("sesiones.jsp");
//        view.forward(request, response);
    }

    private Comando buscaComando(String cmd) throws ComandoException {
        if (cmd == null) {
            cmd = "error";
        }
        if (comandos.containsKey(cmd)) {
            return (Comando) comandos.get(cmd);
        } else {
            System.out.println("Comando " + cmd + " Invalido !!!");
            throw new ComandoException("Invalid Command Identifier");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
