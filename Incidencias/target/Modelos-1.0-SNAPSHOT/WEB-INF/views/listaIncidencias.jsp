<%--
  Created by IntelliJ IDEA.
  User: jaimi
  Date: 3/06/2024
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="modelo.Incidencia" %>
<html>
<head>
  <title>Lista de Incidencias</title>
</head>
<body>
<h1 class='mb-3'>Lista de Incidencias</h1>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Nombre</th>
    <th>Lugar</th>
    <th>Referencia</th>
    <th>Foto</th>
    <th>Victima</th>
    <th>Contacto</th>
    <th>Requiere Ambulancia</th>
    <th>Requiere Policía</th>
    <th>Requiere Bombero</th>
    <th>Descripción de la Solución</th>
    <th></th>
    <th></th>
  </tr>
  <%
    List<Incidencia> listaIncidencias = (List<Incidencia>) request.getAttribute("listaIncidencias");
    for (Incidencia incidencia : listaIncidencias) {
  %>
  <tr>
    <td><%= incidencia.getId() %></td>
    <td><%= incidencia.getNombre() %></td>
    <td><%= incidencia.getLugar() %></td>
    <td><%= incidencia.getReferencia() %></td>
    <td><%= incidencia.getFoto() %></td>
    <td><%= incidencia.getVictima() %></td>
    <td><%= incidencia.getContacto() %></td>
    <td><%= incidencia.isRequiereAmbulancia() ? "Sí" : "No" %></td>
    <td><%= incidencia.isRequierePolicia() ? "Sí" : "No" %></td>
    <td><%= incidencia.isRequiereBombero() ? "Sí" : "No" %></td>
    <td><%= incidencia.getdescriptionSolucion() %></td>
    <td><a href="">Editar</a></td>
    <td><a href="">Eliminar</a></td>
  </tr>
  <% } %>
</table>
</body>
</html>

