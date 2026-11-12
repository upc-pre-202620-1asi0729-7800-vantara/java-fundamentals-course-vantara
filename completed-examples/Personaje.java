public class Personaje {

    private String nombre;
    private int vida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        }
    }

    public int getVida() {
        return vida;
    }

    public static void main(String[] args) {

        Personaje caballero = new Personaje();

        caballero.setNombre("Thor");
        caballero.setVida(100);

        System.out.println("Nombre: " + caballero.getNombre());
        System.out.println("Vida: " + caballero.getVida());

        caballero.setVida(80);

        System.out.println("Nueva vida: " + caballero.getVida());

    }
}