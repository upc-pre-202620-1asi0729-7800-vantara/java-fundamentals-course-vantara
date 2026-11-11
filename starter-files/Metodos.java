/*
 * Lección 3 - Métodos
 * Programa: El personaje salta
 *
 * En este ejemplo aprenderemos a crear un método
 * y a ejecutarlo desde el método main().
 */

public class Main {

    // Paso 1: Creamos un método llamado "saltar".
    // public significa que puede ser utilizado desde otras clases.
    // static permite ejecutarlo sin crear un objeto de la clase Main.
    // void indica que este método no devuelve ningún valor.
    public static void saltar() {

        // Paso 2: Mostramos un mensaje en la consola.
        System.out.println("¡El personaje está saltando!");

    } // Aquí termina el método saltar().

    // Paso 3: Creamos el método main().
    // Es el punto de entrada del programa.
    public static void main(String[] args) {

        // Paso 4: Llamamos al método saltar().
        // Esto hace que se ejecute el código que está dentro de él.
        saltar();

    } // Aquí termina el método main().

} // Aquí termina la clase Main.