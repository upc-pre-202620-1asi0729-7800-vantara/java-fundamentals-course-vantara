mport java.util.Scanner;

class Personaje {

    private String nombre;
    private int vida;
    private int monedas;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.monedas = 0;
    }

    public void recibirDanio(int danio) {

        if (danio > 0) {
            vida = vida - danio;

            if (vida < 0) {
                vida = 0;
            }
        }
    }

    public void recogerMonedas(int cantidad) {

        if (cantidad > 0) {
            monedas = monedas + cantidad;
        }
    }

    public void mostrarEstado() {

        System.out.println("Jugador: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Monedas: " + monedas);

    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a Pixel Quest!");
        System.out.print("Escribe tu nombre: ");

        String nombre = scanner.nextLine();

        Personaje jugador = new Personaje(nombre);

        String[] mochila = new String[3];

        System.out.println("\n¡Comienza tu aventura!");

        for (int i = 0; i < mochila.length; i++) {

            System.out.print("¿Qué objeto encontraste? ");

            mochila[i] = scanner.nextLine();

            System.out.println(
                    "¡Guardaste " + mochila[i] + "!"
            );

        }

        jugador.recogerMonedas(20);

        jugador.recibirDanio(15);

        System.out.println("\n--- ESTADO DEL JUGADOR ---");

        jugador.mostrarEstado();

        System.out.println("\n--- MOCHILA ---");

        for (int i = 0; i < mochila.length; i++) {

            System.out.println(mochila[i]);

        }

        scanner.close();

    }
}
