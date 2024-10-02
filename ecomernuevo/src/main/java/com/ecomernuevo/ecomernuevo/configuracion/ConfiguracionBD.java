package com.ecomernuevo.ecomernuevo.configuracion;


import com.ecomernuevo.ecomernuevo.abstractfactory.BD_MySQL;
import com.ecomernuevo.ecomernuevo.abstractfactory.BD_Oracle;
import com.ecomernuevo.ecomernuevo.abstractfactory.BD_Postgres;
import com.ecomernuevo.ecomernuevo.abstractfactory.IProductoDAO;

public class ConfiguracionBD {
    private static IProductoDAO productoDAO;

    public static void configureAdapterDB(String motorDB) {
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
        if (productoDAO == null) {
            throw new IllegalStateException("No se ha configurado ningún motor de base de datos.");
        }
        return productoDAO;
    }


}
