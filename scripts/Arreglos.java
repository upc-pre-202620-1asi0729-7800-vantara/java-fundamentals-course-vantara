/*
 * Lección 5 - Arreglos (Arrays) e Integración de conceptos anteriores
 * Programa: Inventario del personaje
 *
 * En este ejemplo aprenderemos a crear un arreglo,
 * guardar elementos y acceder a ellos mediante sus posiciones.
 */

public class Inventario {

    public static void main(String[] args) {

        // Creamos un arreglo llamado "mochila" con espacio para 3 elementos
        String[] mochila = new String[3];

        // Guardamos objetos en cada posición del arreglo (comenzando desde 0)
        mochila[0] = "Espada";
        mochila[1] = "Pocion";
        mochila[2] = "Escudo";

        // Mostramos los objetos almacenados en el inventario
        System.out.println("=== INVENTARIO DEL PERSONAJE ===");

        System.out.println("Espacio 1: " + mochila[0]); // Mostramos el objeto de la posición 0
        System.out.println("Espacio 2: " + mochila[1]); // Mostramos el objeto de la posición 1
        System.out.println("Espacio 3: " + mochila[2]); // Mostramos el objeto de la posición 2

    }
}