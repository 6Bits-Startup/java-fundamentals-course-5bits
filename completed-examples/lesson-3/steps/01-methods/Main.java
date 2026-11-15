public class Main {

    // Método sin parámetros: siempre hace lo mismo
    static void showBanner() {
        System.out.println("************************");
        System.out.println("  Bienvenida al juego");
        System.out.println("************************");
    }

    // Método con parámetros: recibe datos para trabajar
    static void greet(String name, int level) {
        System.out.println("¡Hola, " + name + "! Estás en el nivel " + level);
    }

    public static void main(String[] args) {
        showBanner();
        greet("Lucía", 1);

        showBanner();
        greet("Mateo", 2);
    }
}
