<%-- 
    Document   : Bienvenida
    Created on : 19/10/2024, 11:10:25 p. m.
    Author     : ALICIA PETRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Bienvenida</title>
    </head>
    <body>
        <h1>¡Bienvenido, <%= request.getAttribute("usuario") %>! Has ingresado correctamente.</h1>
        <p>Gracias por iniciar sesión. Puedes acceder a más funciones en nuestra aplicación.</p>
    </body>
</html>
