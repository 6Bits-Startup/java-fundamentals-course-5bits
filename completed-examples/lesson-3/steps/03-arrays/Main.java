public class Main {
    public static void main(String[] args) {
        String[] foods = {"ceviche", "lomo saltado", "papa rellena", "anticuchos"};

        System.out.println("Primera comida: " + foods[0]);   // ceviche
        System.out.println("Tercera comida: " + foods[2]);   // papa rellena
        System.out.println("Cantidad: " + foods.length);     // 4

        foods[3] = "ají de gallina";   // cambiamos el último elemento

        // Recorrer con for clásico (cuando necesitas la posición)
        for (int i = 0; i < foods.length; i++) {
            System.out.println((i + 1) + ". " + foods[i]);
        }

        // Recorrer con for-each (cuando solo necesitas cada elemento)
        int[] scores = {120, 85, 240, 60};
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        System.out.println("Puntaje total: " + total);   // 505
    }
}
