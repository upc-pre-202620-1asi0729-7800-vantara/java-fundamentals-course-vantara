/*
 * Lección 5 - Arreglos (Arrays) e Integración de conceptos anteriores
 * Programa: Inventario del personaje
 *
 * En este ejemplo aprenderemos a crear un arreglo,
 * guardar elementos y acceder a ellos mediante sus posiciones.
 */

public class Main {

    public static void main(String[] args) {

        // PASO 1: Creamos un arreglo llamado "mochila".
        // String indica que almacenaremos textos.
        // new String[3] significa que tendrá espacio para 3 elementos.
        String[] mochila = new String[3];

        // PASO 2: Guardamos objetos en cada posición del arreglo.
        // Los arreglos comienzan desde la posición 0.
        mochila[0] = "Espada";
        mochila[1] = "Pocion";
        mochila[2] = "Escudo";

        // PASO 3: Mostramos los objetos almacenados.
        System.out.println("=== INVENTARIO DEL PERSONAJE ===");

        System.out.println("Espacio 1: " + mochila[0]);
        System.out.println("Espacio 2: " + mochila[1]);
        System.out.println("Espacio 3: " + mochila[2]);

    }
}