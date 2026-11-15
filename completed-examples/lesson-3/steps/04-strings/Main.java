public class Main {
    public static void main(String[] args) {
        String name = "Lucía Torres";

        System.out.println("Letras (con espacio): " + name.length());   // 12
        System.out.println("En mayúsculas: " + name.toUpperCase());     // LUCÍA TORRES
        System.out.println("En minúsculas: " + name.toLowerCase());     // lucía torres
        System.out.println("Primera letra: " + name.charAt(0));         // L
        System.out.println("¿Contiene 'Torres'? " + name.contains("Torres"));  // true

        // Para comparar textos se usa equals, NO ==
        String password = "gato123";
        String attempt = "gato123";
        System.out.println("¿Contraseña correcta? " + password.equals(attempt));  // true
    }
}
