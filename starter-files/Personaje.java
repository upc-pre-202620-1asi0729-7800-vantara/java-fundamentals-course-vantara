/*
 * Lección 4 - Clases y Objetos
 * Programa: Crear un personaje
 *
 * En este ejemplo aprenderemos a crear una clase,
 * utilizar atributos privados y acceder a ellos
 * mediante getters y setters.
 */

public class Personaje {

    // PASO 1: Declaramos los atributos privados.
    // private evita que otras clases puedan modificarlos directamente.
    private String nombre;
    private int vida;

    // PASO 2: Creamos un getter para obtener el nombre.
    public String getNombre() {
        return nombre;
    }

    // PASO 3: Creamos un setter para modificar el nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // PASO 4: Creamos un setter para modificar la vida.
    // Solo permite valores entre 0 y 100.
    public void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        }
    }

    // PASO 5: Creamos un getter para consultar la vida.
    public int getVida() {
        return vida;
    }

    // PASO 6: Método principal donde comienza el programa.
    public static void main(String[] args) {

        // Creamos un objeto de tipo Personaje.
        Personaje caballero = new Personaje();

        // Asignamos los valores utilizando los setters.
        caballero.setNombre("Thor");
        caballero.setVida(100);

        // Mostramos los datos utilizando los getters.
        System.out.println("Nombre: " + caballero.getNombre());
        System.out.println("Vida: " + caballero.getVida());

        // Intentamos modificar la vida.
        caballero.setVida(80);

        // Mostramos la vida actualizada.
        System.out.println("Nueva vida: " + caballero.getVida());

    }
}