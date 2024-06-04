<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Incidencias</title>
</head>
<body>
<h2>Lista de Incidencias</h2>
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
    </tr>
    <c:forEach var="incidencia" items="${listaIncidencias}">
        <tr>
            <td>${incidencia.id}</td>
            <td>${incidencia.nombre}</td>
            <td>${incidencia.lugar}</td>
            <td>${incidencia.referencia}</td>
            <td>${incidencia.foto}</td>
            <td>${incidencia.victima}</td>
            <td>${incidencia.contacto}</td>
            <td>${incidencia.requiereAmbulancia ? "Sí" : "No"}</td>
            <td>${incidencia.requierePolicia ? "Sí" : "No"}</td>
            <td>${incidencia.requiereBombero ? "Sí" : "No"}</td>
            <td>${incidencia.descripcionSolucion}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

</html>