package fr.eni.encheres;


import java.sql.Connection;
import java.sql.SQLException;
public class TestCon {
    public static void main(String[] args) {

        Connection con = null;
        try {
            con = ConnectionProvider.getConnection();
            System.out.println("Got it!");
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}