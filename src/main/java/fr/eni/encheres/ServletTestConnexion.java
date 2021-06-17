package fr.eni.encheres;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "ServletTestConnexion", value = "/ServletTestConnexion")
public class ServletTestConnexion extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Connection con = null;
        try {
            con = ConnectionProvider.getConnection();
            System.out.println("Got it!");
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
