<%-- 
    Document   : registro
    Created on : 18-sep-2017, 10:20:45
    Author     : josep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Registro</h1>
        <form action="registrar" method="post">
            <label>Nombre</label>
            <input type="text" name="nombre"/><br>
            <label>Apellido Paterno</label>
            <input type="text" name="apellido paterno"/><br>
            <label>Apellido Materno</label>
            <input type="text" name="apellido materno"/><br>
            <label>DNI</label>
            <input type="text" name="DNI"/><br>
            <label>Nacimineto</label>
            <input type="text" name="nacimineto"/><br>
            <label>Estado Civil</label>
            <select name="estado civil"><br>
                <option>Casado</option>
                <option>Soltero</option>
                <option>Divorciado</option>
            </select>
            <label>Telefono</label>
            <input type="text" name="telefono"/><br>
            <label>Pais</label>
            <select name="pais"><br>
                <option>Peru</option>
                <option>Brazil</option>
                <option>Venezuela</option>
                <option>Chile</option>
                <option>Ecuador</option>
            </select>
            <label>Region</label>
            <input type="text" name="region"/><br>
            <label>Ciudad</label>
            <input type="text" name="ciudad"/><br>
            <label>Usuario</label>
            <input type="text" name="usuario"/><br>
            <label>Contraseña</label>
            <input type="password" name="contraseña"/><br>
            <input type="submit" value="Registrar" />
        </form>
        <a href="index.jsp">Volver</a>
    </body>
</html>
