package dao;

import modelo.Incidencia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IncidenciaDAO {
    private Connection connection;

    public IncidenciaDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Incidencia> listarIncidencias() throws SQLException {

        List<Incidencia> incidencias = new ArrayList<>();
        String sql = "SELECT * FROM Incidencias";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Incidencia incidencia = new Incidencia();
                incidencia.setId(resultSet.getInt("idIncidencias"));
                incidencia.setNombre(resultSet.getString("nombreIncidencia"));
                incidencia.setLugar(resultSet.getString("lugarExacto"));
                incidencia.setReferencia(resultSet.getString("referenciaIncidencia"));
                incidencia.setFoto(resultSet.getString("fotoIncidencia")); // Asumiendo que es un String
                incidencia.setVictima(resultSet.getString("victimaIncidencia"));
                incidencia.setContacto(resultSet.getInt("contactoIncidencia"));
                incidencia.setRequiereAmbulancia(resultSet.getBoolean("requiereAmbulancia"));
                incidencia.setRequierePolicia(resultSet.getBoolean("requierePolicia"));
                incidencia.setRequiereBombero(resultSet.getBoolean("requiereBombero"));
                incidencia.setDescripcionSolucion(resultSet.getString("descriptionSolucion"));
                incidencias.add(incidencia);
                System.out.println("Incidencia recuperada: " + incidencia.getNombre());

            }
            System.out.println("Query ejecutada, número de incidencias: " + incidencias.size());

        }
        return incidencias;


    }
}