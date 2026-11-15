public class Main {
    public static void main(String[] args) {
        int apples = 7;
        int friends = 2;

        System.out.println("Suma: " + (apples + friends));                // 9
        System.out.println("Resta: " + (apples - friends));               // 5
        System.out.println("Multiplicación: " + (apples * friends));      // 14
        System.out.println("División: " + (apples / friends));            // 3 (división entera)
        System.out.println("Sobran: " + (apples % friends));              // 1 (residuo)
        System.out.println("División con decimales: " + (7.0 / 2));       // 3.5

        // Comparaciones: el resultado siempre es true o false
        int age = 14;
        System.out.println("¿Es mayor de 12? " + (age > 12));      // true
        System.out.println("¿Tiene 18? " + (age == 18));           // false
        System.out.println("¿No tiene 18? " + (age != 18));        // true

        // Atajos útiles
        int lives = 3;
        lives++;          // lo mismo que lives = lives + 1
        lives -= 2;       // lo mismo que lives = lives - 2
        System.out.println("Vidas: " + lives);                     // 2
    }
}
