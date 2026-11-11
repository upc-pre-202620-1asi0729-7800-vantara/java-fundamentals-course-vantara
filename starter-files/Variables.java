/*
 * Lección 2 - Variables y tipos de datos
 * Programa: Sistema de vida de un personaje
 *
 * En este archivo encontrarás un ejemplo de cómo declarar
 * una variable, modificar su valor y mostrarlo en consola.
 */

// Paso 1: Toda clase en Java empieza con "public class" seguido del nombre.
// El nombre de la clase debe ser exactamente igual al nombre del archivo (Main.java).
public class Main {

    // Paso 2: El método main() es el punto de entrada del programa.
    // Cuando ejecutas un programa en Java, esto es lo primero que se ejecuta.
    public static void main(String[] args) {

        // Paso 3: Declaramos una variable llamada "vida" de tipo int.
        // int permite almacenar números enteros.
        // Nuestro personaje comienza con 100 puntos de vida.
        int vida = 100;

        // Paso 4: Modificamos el valor de la variable "vida".
        // Restamos 20 puntos a su valor actual.
        // Ahora nuestro personaje tiene 80 puntos de vida.
        vida = vida - 20;

        // Paso 5: Utilizamos System.out.println() para mostrar
        // el valor actualizado de la variable "vida" en la consola.
        System.out.println(vida);

    } // Paso 6: Esta llave cierra el método main().

} // Paso 7: Esta llave cierra la clase Main.