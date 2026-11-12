/*
 * Lección 3 - Métodos
 * Programa: Acciones y vida del personaje
 *
 * En este ejemplo aprenderemos a crear métodos
 * con y sin valores de retorno, y a utilizarlos
 * para ejecutar acciones y calcular la vida del personaje.
 */

public class Main {

    public static void saltar() { // Método sin parámetros y sin valor de retorno (void)
        System.out.println("¡El personaje está saltando!"); // Muestra un mensaje en pantalla
    }

    public static int calcularVida(int vidaActual, int danio) { // Método que recibe dos enteros y devuelve un int
        return vidaActual - danio; // Calcula y retorna la vida restante después de recibir daño
    }

    public static void main(String[] args) { // Método main: punto de inicio del programa

        saltar(); // Llamamos al método saltar() para ejecutar la acción del personaje

        int vida = calcularVida(100, 30); // Calculamos la vida restante: 100 - 30 = 70

        System.out.println(vida); // Mostramos la vida actualizada en la consola

    }
}