/*
 * Lección 2 - Variables y tipos de datos
 * Programa: Sistema de vida y acciones de un personaje
 *
 * En este archivo encontrarás ejemplos de cómo declarar
 * y modificar variables, recibir datos del usuario
 * y utilizar ciclos para repetir instrucciones.
 */

import java.util.Scanner; // Importamos Scanner para leer datos ingresados por el usuario

public class Main {

    public static void main(String[] args) { // Método main: punto de inicio del programa

        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para recibir datos

        System.out.println("¿Cómo te llamas?"); // Preguntamos el nombre del jugador
        String nombre = scanner.nextLine(); // Guardamos el nombre ingresado en una variable String

        System.out.println("¡Bienvenido, " + nombre + "!"); // Mostramos un mensaje de bienvenida

        int vida = 100; // Declaramos una variable int con 100 puntos de vida

        vida = vida - 20; // Restamos 20 puntos a la vida actual del personaje

        System.out.println("Vida del personaje: " + vida); // Mostramos la vida actualizada

        for (int i = 1; i <= 5; i++) { // Repetimos la acción mientras i sea menor o igual a 5
            System.out.println("Golpe número: " + i); // Mostramos el número de cada golpe
        }

        int energia = 3; // Declaramos una variable int con 3 puntos de energía

        while (energia > 0) { // Repetimos las instrucciones mientras la energía sea mayor que 0
            System.out.println("¡El personaje sigue jugando!"); // Mostramos un mensaje durante cada repetición
            energia--; // Restamos 1 punto de energía en cada repetición
        }

        scanner.close(); // Cerramos Scanner porque ya no necesitamos recibir más datos

    }
}