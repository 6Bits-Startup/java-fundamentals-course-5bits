public class Main {

    // Devuelve el promedio de los puntajes
    static double average(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Devuelve la posición del puntaje más alto
    static int indexOfHighest(int[] scores) {
        int bestIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[bestIndex]) {
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    // Crea un nombre de usuario: nombre en minúsculas, sin espacios, + número
    static String createUsername(String name, int number) {
        return name.toLowerCase().replace(" ", "") + number;
    }

    // Muestra una barra de estrellas proporcional al puntaje (1 estrella cada 20 puntos)
    static void printBar(String player, int score) {
        String bar = "";
        for (int i = 0; i < score / 20; i++) {
            bar += "★";
        }
        System.out.println(player + " | " + bar + " " + score);
    }

    public static void main(String[] args) {
        String[] players = {"Lucía Torres", "Mateo Ruiz", "Ana Quispe", "Diego Salas"};
        int[] scores = {120, 85, 240, 60};

        System.out.println("===== TABLERO DE PUNTAJES =====");
        for (int i = 0; i < players.length; i++) {
            String username = createUsername(players[i], i + 1);
            printBar(username, scores[i]);
        }

        int best = indexOfHighest(scores);
        System.out.println("-------------------------------");
        System.out.println("Promedio: " + average(scores));
        System.out.println("Ganador: " + players[best].toUpperCase()
                + " con " + scores[best] + " puntos 🏆");
    }
}
