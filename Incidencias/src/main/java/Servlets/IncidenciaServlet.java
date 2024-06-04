package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import dao.IncidenciaDAO;
import modelo.Incidencia;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "IncidenciaServlet", urlPatterns = {"/incidencias"})
public class IncidenciaServlet extends HttpServlet {
    private IncidenciaDAO incidenciaDAO;

    public void init() throws ServletException {
        String jdbcURL = "jdbc:mysql://localhost:3306/proyecto-iweb";
        String jdbcUsername = "root";
        String jdbcPassword = "TUCONTRASEÑA";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            incidenciaDAO = new IncidenciaDAO(connection);
        } catch (SQLException | ClassNotFoundException e) {
            throw new ServletException("Error al conectar a la base de datos", e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Incidencia> listaIncidencias = incidenciaDAO.listarIncidencias();
            request.setAttribute("listaIncidencias", listaIncidencias);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/listaIncidencias.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            throw new ServletException("Error al recuperar datos de incidencias", e);
        }
    }
}
