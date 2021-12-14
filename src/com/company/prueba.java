package com.company;

import java.sql.Connection;

public class prueba {

    public static void main(String[] args) {

        Connection con;
        ConexionDB conexion = new ConexionDB ();
        con = conexion.ConectarBaseDatos();
    }
}
