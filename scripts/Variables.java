/*
 * Lección 2 - Variables y decisiones
 * Programa: Sistema de vida y acciones de un personaje
 *
 * En este archivo encontrarás ejemplos de cómo declarar
 * variables de distintos tipos, hacer operaciones,
 * comparar valores, tomar decisiones con if y else,
 * repetir instrucciones con bucles y recibir datos del usuario.
 */

import java.util.Scanner; // Importamos Scanner para leer datos ingresados por el usuario

public class Main {

    public static void main(String[] args) { // Método main: punto de inicio del programa

        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para recibir datos

        System.out.println("¿Cómo te llamas?"); // Preguntamos el nombre del jugador
        String nombre = scanner.nextLine(); // Guardamos el nombre ingresado en una variable String

        System.out.println("¡Bienvenido, " + nombre + "!"); // Mostramos un mensaje de bienvenida

        int vida = 100; // int: número entero, la vida del personaje
        double velocidad = 5.5; // double: número con decimales, la velocidad del personaje
        boolean tieneEspada = true; // boolean: solo puede ser true (verdadero) o false (falso)
        int monedas = 60; // int: las monedas que ha recogido el personaje

        System.out.println("Velocidad: " + velocidad); // Mostramos la velocidad
        System.out.println("¿Tiene espada? " + tieneEspada); // Mostramos si tiene espada

        vida = vida - 20; // Operador aritmético: restamos 20 puntos a la vida actual

        System.out.println("Vida del personaje: " + vida); // Mostramos la vida actualizada

        System.out.println("¿La vida es mayor que 0? " + (vida > 0)); // Comparación: mayor que
        System.out.println("¿La vida es igual a 100? " + (vida == 100)); // Comparación: igual a
        System.out.println("¿La vida es diferente de 0? " + (vida != 0)); // Comparación: diferente de
        System.out.println("¿Puede pelear? " + (vida > 0 && tieneEspada)); // Operador lógico && (Y): ambas condiciones deben cumplirse

        if (monedas >= 50) { // if: se ejecuta si el personaje tiene al menos 50 monedas
            System.out.println("¡Puerta abierta!"); // Mensaje cuando se cumple la condición
        } else { // else: se ejecuta cuando la condición no se cumple
            System.out.println("No tienes suficientes monedas."); // Mensaje cuando no se cumple
        }

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