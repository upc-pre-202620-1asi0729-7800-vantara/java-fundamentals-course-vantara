public class Inventario {

    // Método que muestra los objetos almacenados en la mochila
    static void mostrarInventario(String[] mochila) {
        for (int i = 0; i < mochila.length; i++) {
            System.out.println("Objeto " + (i + 1) + ": " + mochila[i]);
        }
    }

    // Método que busca un objeto dentro de la mochila
    static void buscarObjeto(String[] mochila, String objeto) {
        boolean encontrado = false;

        for (int i = 0; i < mochila.length; i++) {
            if (mochila[i].equalsIgnoreCase(objeto)) {
                System.out.println("¡Encontraste " + objeto + "!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No tienes ese objeto en tu inventario.");
        }
    }

    // Método que cuenta cuántos espacios tiene la mochila
    static void contarObjetos(String[] mochila) {
        int cantidad = 0;

        for (int i = 0; i < mochila.length; i++) {
            if (mochila[i] != null) {
                cantidad++;
            }
        }

        System.out.println("Objetos en la mochila: " + cantidad);
    }

    public static void main(String[] args) {

        System.out.println("--- Inventario ---");

        String[] mochila = new String[3];

        mochila[0] = "Espada";
        mochila[1] = "Pocion";
        mochila[2] = "Escudo";

        mostrarInventario(mochila);

        System.out.println("\n--- Búsqueda de objetos ---");
        buscarObjeto(mochila, "Espada");
        buscarObjeto(mochila, "Arco");

        System.out.println("\n--- Espacios ocupados ---");
        contarObjetos(mochila);

    }
}