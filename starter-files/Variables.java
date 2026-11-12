/*
 * Lección 2 - Variables y decisiones
 * Programa: Sistema de vida de un personaje
 *
 * En este archivo encontrarás un ejemplo paso a paso de cómo
 * declarar variables, hacer operaciones, tomar decisiones
 * con if y else, y mostrar los resultados en consola.
 */

// Paso 1: Toda clase en Java empieza con "public class" seguido del nombre.
// El nombre de la clase debe ser exactamente igual al nombre del archivo (Main.java).
public class Main {

    // Paso 2: El método main() es el punto de entrada del programa.
    // Cuando ejecutas un programa en Java, esto es lo primero que se ejecuta.
    public static void main(String[] args) {

        // Paso 3: Declaramos variables de distintos tipos.
        // int guarda números enteros, double guarda números con decimales
        // y boolean guarda solamente verdadero (true) o falso (false).
        int vida = 100;
        double velocidad = 5.5;
        boolean tieneEspada = true;
        int monedas = 60;

        // Paso 4: Modificamos el valor de la variable "vida".
        // Restamos 20 puntos a su valor actual.
        // Ahora nuestro personaje tiene 80 puntos de vida.
        vida = vida - 20;

        // Paso 5: Utilizamos System.out.println() para mostrar
        // el valor actualizado de la variable "vida" en la consola.
        System.out.println(vida);

        // Paso 6: Comparamos valores. El resultado es true o false.
        System.out.println(vida > 0);
        System.out.println(vida == 100);
        System.out.println(vida != 0);

        // Paso 7: Combinamos condiciones con && (significa "Y").
        // El resultado es true solo si las dos condiciones se cumplen.
        System.out.println(vida > 0 && tieneEspada);

        // Paso 8: Tomamos una decisión con if y else.
        // Para abrir la puerta mágica se necesitan al menos 50 monedas.
        // Cambia monedas a 20 y observa qué mensaje aparece.
        if (monedas >= 50) {
            System.out.println("¡Puerta abierta!");
        } else {
            System.out.println("No tienes suficientes monedas.");
        }

        System.out.println("Velocidad: " + velocidad);

    } // Paso 9: Esta llave cierra el método main().

} // Paso 10: Esta llave cierra la clase Main.