/*
 * Lección 4 - Clases y Objetos
 * Programa: Crear un personaje
 *
 * En este ejemplo aprenderemos a crear una clase,
 * utilizar atributos privados y acceder a ellos
 * mediante getters y setters.
 */

public class Personaje { // Declaramos la clase principal llamada Personaje

    private String nombre; // Atributo privado que almacena el nombre del personaje
    private int vida; // Atributo privado que almacena los puntos de vida

    public String getNombre() { // Getter que permite obtener el nombre del personaje
        return nombre; // Retorna el valor almacenado en "nombre"
    }

    public void setNombre(String nombre) { // Setter que permite modificar el nombre
        this.nombre = nombre; // Asignamos el valor recibido al atributo de la clase
    }

    public void setVida(int vida) { // Setter que permite modificar los puntos de vida
        if (vida >= 0 && vida <= 100) { // Comprobamos que la vida esté entre 0 y 100
            this.vida = vida; // Asignamos el valor recibido al atributo "vida"
        }
    }

    public int getVida() { // Getter que permite consultar los puntos de vida
        return vida; // Retorna el valor almacenado en "vida"
    }

    public static void main(String[] args) { // Método main: punto de inicio del programa

        Personaje caballero = new Personaje(); // Creamos un objeto de tipo Personaje llamado "caballero"

        caballero.setNombre("Thor"); // Asignamos el nombre utilizando el setter
        caballero.setVida(100); // Asignamos 100 puntos de vida al personaje

        System.out.println("Nombre: " + caballero.getNombre()); // Mostramos el nombre utilizando el getter
        System.out.println("Vida: " + caballero.getVida()); // Mostramos los puntos de vida

        caballero.setVida(80); // Modificamos los puntos de vida del personaje

        System.out.println("Nueva vida: " + caballero.getVida()); // Mostramos la vida actualizada

    }
}