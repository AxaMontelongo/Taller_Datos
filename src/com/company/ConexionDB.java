package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    Connection con;//Intancia de Connection
    //String driver = "com.mysql.jdbc.Driver"; //Libreria version 5
    private String driver = "com.mysql.cj.jdbc.Driver"; //Libreria version 8
    private String dbName = "CICLISTAS";
    private String url = "jdbc:mysql://localhost:3306/"+dbName; // Url de base de datos
    private String usuario = "root"; // Variable para usuario de la base de datos
    private String password = "1234"; // Variable para contraseña de la base de datos

    public Connection ConectarBaseDatos() { //metodo para la conexion
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, password);
            System.out.println("SE ACABA DE CONECTAR A LA BASE DE DATOS: "+dbName);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexion:" + e);
        }
        return con;
    }
}
