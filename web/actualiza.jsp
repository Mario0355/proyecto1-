<%-- 
    Document   : actualiza
    Created on : 31/08/2020
    Author     : Mario 
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.cliente.clienteBean" %>
<%
    clienteBean temp = (clienteBean) request.getAttribute("bean");
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <div class="form-style-6">
            <h1>Actualización de Cliente</h1>
            <form action="Cliente?cmd=cliente" method="POST">
                <input type="hidden" name="acc" value="actualizaSave">
                Usuario<input type="text" name="usuario" value="<%=temp.getUsuario()%>" readonly="true"><br>
                Contraseña<input type="password" name="contrasena" value="<%=temp.getContrasena()%>" ><br>
                Nombre<input type="text" name="nombre" value="<%=temp.getNombre()%>"  ><br>
                Email<input type="text" name="email"value="<%=temp.getEmail()%>"  ><br>
                Dirección<input type="text" name="direccion" value="<%=temp.getDireccion()%>" ><br>
                <input type="submit">
            </form>
            <a href="AdminServlet?cmd=cliente&acc=consultaGeneral">Consultar clientes</a>
            
            
                               
        </div>
    </body>
</html>
