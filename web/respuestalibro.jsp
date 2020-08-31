<%-- 
    Document   : respuestalibro
    Created on : 31/08/2020
    Author     : Mario 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.LinkedList" %>
<%@page import="java.util.Iterator" %>
<%@page import="com.cliente.LibroBean" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/Evidencia1/CSS/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Libros</h1>
        <% 
            LinkedList lista = (LinkedList) request.getAttribute("lista");
            if (lista !=null)
            for (Iterator it = lista.iterator(); it.hasNext();){
                Object elem = it.next();
                out.println(   ((LibroBean) elem).getNombrelibro() );
                out.println( "<br>" + ((LibroBean) elem).getNombrelibro() );
                out.println( "<br>" +   ((LibroBean) elem).getTipodelibro());
                out.println( "<br>" +   ((LibroBean) elem).getEditorial());
                out.println( "<br>" +   ((LibroBean) elem).getAutor());
                out.println( "<br>" +   ((LibroBean) elem).getCodigo());
                out.println( "==" );
                
            }
                %>
                        
            
        <br><br>
        <% if(request.getParameter("acc").equals("guardar")){ %>
            <p>Datos Libro </p>
            <%=(( LibroBean )request.getAttribute("libro")).getNombrelibro()%>
            <br><br>
        <% } %>
    </body>
</html>
