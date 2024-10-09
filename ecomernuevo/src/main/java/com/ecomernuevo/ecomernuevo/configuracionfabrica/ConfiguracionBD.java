package com.ecomernuevo.ecomernuevo.configuracionfabrica;


import com.ecomernuevo.ecomernuevo.factory.BD_MySQL;
import com.ecomernuevo.ecomernuevo.factory.BD_Oracle;
import com.ecomernuevo.ecomernuevo.factory.BD_Postgres;
import com.ecomernuevo.ecomernuevo.factory.IProductoDAO;

public class ConfiguracionBD {
    private static IProductoDAO productoDAO;

    public static void configureAdapterDB() {
        String motorDB = Configuracion.getMotorDB();  // Leer el motor de la clase Configuracion
        switch (motorDB.toLowerCase()) {
            case "mysql":
                productoDAO = new BD_MySQL();
                break;
            case "oracle":
                productoDAO = new BD_Oracle();
                break;
            case "postgres":
                productoDAO = new BD_Postgres();
                break;
            default:
                throw new UnsupportedOperationException("Motor de base de datos no soportado.");
        }
    }

    public static IProductoDAO getProductoDAO() {
        return productoDAO;
    }
}
