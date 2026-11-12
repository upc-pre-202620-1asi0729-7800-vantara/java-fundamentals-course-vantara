
public class Main {

    // Método que ejecuta la acción de saltar
    static void saltar() {
        System.out.println("¡El personaje está saltando!");
    }

    // Método que calcula la vida restante después de recibir daño
    static int calcularVida(int vidaActual, int danio) {
        return vidaActual - danio;
    }

    public static void main(String[] args) {

        saltar();

        int vida = calcularVida(100, 30);
        System.out.println("Vida restante: " + vida);

        System.out.println("Vida después de otro ataque: " + calcularVida(vida, 20));

    }
}