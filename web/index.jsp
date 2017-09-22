<%-- 
    Document   : index
    Created on : 18-sep-2017, 10:15:21
    Author     : josep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion</title>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        <form action="iniciar" method="post">
            <label>Nombre</label>
            <input type="text" name="usuario"/><br>
            <label>Contraseña</label>
            <input type="password" name="contraseña"/><br>
            <input type="submit" value="iniciar sesion"/>
        </form>
        
    </body>
</html>
