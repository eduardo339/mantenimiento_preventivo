package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sistemas
 */
public class Conexion {

    public static Connection getConection() {
        String connexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=mantenimiento_preventivo;"
                + "user=sa;"
                + "password=SQLAdmin;"
                + "loginTimeout=30;"
                + "TrustServerCertificate=True";
        try {
            Connection con = DriverManager.getConnection(connexionUrl);
            return con;
        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return null;
        }
    }
}
