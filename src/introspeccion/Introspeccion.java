/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introspeccion;

import static java.lang.Class.forName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author Juanjo
 */
public class Introspeccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nombreClase;     // String para la lectura de la clase
        Scanner scaner = new Scanner(System.in);    // Lectura de string
        Class clase; // Para pasar el string leido a objeto

        // Solicitud nombre de la clase
        System.out.println("Introduzca el nombre de una clase para obtener su información:");
        nombreClase = scaner.nextLine();    // Almacenamos lo introducido por el usuario

        try {
            // Convertimos el string a Class
            clase = forName(nombreClase);

            // Nombre
            System.out.println(" \n--------------------- NOMBRE ---------------------");
            System.out.println(clase.getName());

            // Constructor
            System.out.println(" \n--------------------- CONSTRUCTORES ---------------------");
            Constructor constructors[] = clase.getConstructors();
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(constructors[i]);
            }

            // Campos
            System.out.println(" \n--------------------- CAMPOS---------------------");
            Field fields[] = clase.getFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i]);
            }

            // Campos
            System.out.println(" \n--------------------- MÉTODOS ---------------------");
            Method method[] = clase.getMethods();
            for (int i = 0; i < method.length; i++) {
                System.out.println(method[i]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
