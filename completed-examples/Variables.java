import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = scanner.nextLine();

        System.out.println("¡Bienvenido, " + nombre + "!");

        int vida = 100;
        vida = vida - 20;

        System.out.println("Vida del personaje: " + vida);

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