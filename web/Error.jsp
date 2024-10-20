<%-- 
    Document   : Error
    Created on : 19/10/2024, 11:10:25 p. m.
    Author     : ALICIA PETRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Error</title>
    </head>
    <body>
        <h1>Error de Autenticación</h1>
        <p><%= request.getAttribute("mensaje") %></p>
        <p><a href="form.jsp">Volver al formulario de inicio de sesión</a></p>
    </body>
</html>

