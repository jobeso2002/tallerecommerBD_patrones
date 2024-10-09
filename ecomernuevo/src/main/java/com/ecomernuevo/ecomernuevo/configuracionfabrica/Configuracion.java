package com.ecomernuevo.ecomernuevo.configuracionfabrica;

public class Configuracion {

    // Simulamos la lectura del archivo de configuración
    private static final String MOTOR_DB = "mysql";

    public static String getMotorDB() {
        return MOTOR_DB;
    }
}
