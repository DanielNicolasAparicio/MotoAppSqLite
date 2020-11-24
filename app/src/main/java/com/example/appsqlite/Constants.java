package com.example.appsqlite;

import java.security.PublicKey;

public class Constants {
    // Nombre de la base de datos
    public static final String DB_NAME = "DB_MOTOCICLETA";

    // Versión de la base de datos
    public  static  final int DB_VERSION = 1;

    // Nombre de la tabla
    public static  final String TABLE_NAME = "MOTOS";

    // Definir los campos
    public static  final String C_ID = "ID";
    public static  final String C_PHOTO = "PHOTO";
    public static  final String C_BRAND = "BRAND";
    public static  final String C_MOTOR = "MOTOR";
    public static  final String C_COLOR = "COLOR";
    public static  final String C_MODELO = "MODELO";
    public static  final String C_VELOCIDAD = "VELOCIDAD";
    public static  final String C_PRICE= "PRICE";


    // Crear consultas de SQLite
    // Insertar datos en TABLE_NAME
    public static final String CREATE_TABLE = "CREATE TABLE" + TABLE_NAME + "("
            + C_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + C_PHOTO + "TEXT,"
            + C_BRAND + "TEXT,"
            + C_MOTOR + "TEXT,"
            + C_COLOR + "TEXT,"
            + C_MODELO + "TEXT,"
            + C_VELOCIDAD + "TEXT,"
            + C_PRICE + "TEXT,"
            + ")";
}
