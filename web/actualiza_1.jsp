<%-- 
    Document   : actualiza
    Created on : 11/11/2017, 11:07:49 AM
    Author     : joe 92
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="bean" scope="request" class="com.cliente.clienteBean"></jsp:useBean>
<link rel="stylesheet" type="text/css" href="/Evidencia1/CSS/style.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <div class="form-style-6">
            <h1>Actualización de Cliente</h1>
            <form action="AdminServlet?cmd=cliente" method="POST">
                <input type="hidden" name="acc" value="actualizaSave">
                Usuario<input type="text" name="usuario" value="<jsp:getProperty name="bean" property="usuario"/>" readonly="true"><br>
                Contraseña<input type="password" name="contrasena" value="<jsp:getProperty name="bean" property="contraseña"/>" ><br>
                Nombre<input type="text" name="nombre" value="<jsp:getProperty name="bean" property="nombre"/>"  ><br>
                Email<input type="text" name="email"value="<jsp:getProperty name="bean" property="email"/>"  ><br>
                Dirección<input type="text" name="direccion" value="<jsp:getProperty name="bean" property="direccion"/>" ><br>
                <input type="submit">
            </form>
            <a href="AdminServlet?cmd=cliente&acc=consultaGeneral">Consultar clientes</a>
            
            
                               
        </div>
    </body>
</html>
