<%-- 
    Document   : actualizalibro
    Created on : 30/11/2017, 11:06:24 AM
    Author     : Mario 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.cliente.LibroBean" %>
<%
    LibroBean temp = (LibroBean) request.getAttribute("bean");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <div class="form-style-6">
            <h1>Actualización de Libro</h1>
            <form action="Cliente?cmd=libro" method="POST">
                <input type="hidden" name="acc" value="actualizaSave">
                    Nombre Libro<input type="text" name="Nombre Libro" value="<%=temp.getNombrelibro()%>" readonly="true"><br>
                    Tipo Libro<input type="text" name="Tipo Libro" value="<%=temp.getTipodelibro()%>" ><br>
                    Editorial<input type="text" name="Editorial" value="<%=temp.getEditorial()%>"  ><br>
                    Autor<input type="text" name="Autor"value="<%=temp.getAutor()%>"  ><br>
                    Codigo<input type="text" name="Codigo" value="<%=temp.getCodigo()%>" ><br>
                <input type="submit">
            </form>
            <a href="AdminServlet?cmd=libro&acc=consultaGeneral">Actualiza Libro</a>
            
            
                               
        </div>
    </body>
</html>

