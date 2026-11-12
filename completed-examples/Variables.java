import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = scanner.nextLine();

        System.out.println("¡Bienvenido, " + nombre + "!");

        int vida = 100;
        double velocidad = 5.5;
        boolean tieneEspada = true;
        int monedas = 60;

        System.out.println("Velocidad: " + velocidad);
        System.out.println("¿Tiene espada? " + tieneEspada);

        vida = vida - 20;

        System.out.println("Vida del personaje: " + vida);

        System.out.println("¿La vida es mayor que 0? " + (vida > 0));
        System.out.println("¿La vida es igual a 100? " + (vida == 100));
        System.out.println("¿La vida es diferente de 0? " + (vida != 0));
        System.out.println("¿Puede pelear? " + (vida > 0 && tieneEspada));

        if (monedas >= 50) {
            System.out.println("¡Puerta abierta!");
        } else {
            System.out.println("No tienes suficientes monedas.");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Golpe número: " + i);
        }

        int energia = 3;

        while (energia > 0) {
            System.out.println("¡El personaje sigue jugando!");
            energia--;
        }

        scanner.close();

    }
}