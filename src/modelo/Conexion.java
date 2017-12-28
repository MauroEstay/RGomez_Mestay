/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Duoc UC
 */
public class Conexion {
     public static Connection getConexion() {
        Connection connection = null;
        try {
           String driverClassName = "com.mysql.jdbc.Driver";
           String driverUrl="jdbc:mysql://localhost/empresa";
           Class.forName(driverClassName);
           connection = DriverManager.getConnection(driverUrl, "root","8162");
           System.out.println("Conexion exitosa!");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
}
}