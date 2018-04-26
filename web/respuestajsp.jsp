<%-- 
    Document   : respuestajsp
    Created on : 11/10/2017, 08:52:55 PM
    Author     : joe 92
--%>
 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.LinkedList" %>
<%@page import="java.util.Iterator" %>
<%@page import="com.cliente.clienteBean" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Captura de Cliente</h1>
        <% 
            LinkedList lista = (LinkedList) request.getAttribute("lista");
            if (lista !=null)
            for (Iterator it = lista.iterator(); it.hasNext();){
                Object elem = it.next();
                out.println(   ((clienteBean) elem).getNombre() );
                out.println( "<br>" + ((clienteBean) elem).getNombre() );
                out.println( "<br>" +   ((clienteBean) elem).getContrasena());
                out.println( "<br>" +   ((clienteBean) elem).getEmail());
                out.println( "<br>" +   ((clienteBean) elem).getUsuario());
                out.println( "<br>" +   ((clienteBean) elem).getDireccion());
                out.println( "**" );
                
            }
                %>
                        
            
        <br><br>
        <p>Datos del Cliente </p>
        <%=request.getAttribute("cliente")%>
        <br><br>
        
    </body>
</html>
