public class Main {
    public static void main(String[] args) {
        // ----- Datos del perfil -----
        // Cambia estos valores por los tuyos
        String name = "Tu nombre";
        int birthYear = 2011;
        int currentYear = 2026;
        double height = 1.60;
        boolean likesMusic = true;
        int gamingMinutesPerDay = 30;

        // ----- Cálculos -----
        // TODO 1: calcula tu edad restando birthYear a currentYear
        int age = 0;

        // TODO 2: calcula cuántos años tendrás dentro de 5 años
        int ageInFiveYears = 0;

        // TODO 3: calcula los minutos de juego por semana (7 días)
        int gamingMinutesPerWeek = 0;

        // TODO 4: convierte esos minutos a horas con / y guarda lo que sobra con %
        int gamingHoursPerWeek = 0;
        int extraMinutes = 0;

        // TODO 5: guarda true si tienes 13 años o más (usa >=)
        boolean isTeenager = false;

        // ----- Tarjeta de perfil -----
        System.out.println("========== MI PERFIL ==========");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age + " años");
        System.out.println("En 5 años tendrá: " + ageInFiveYears + " años");
        System.out.println("Estatura: " + height + " m");
        System.out.println("¿Le gusta la música? " + likesMusic);
        System.out.println("¿Es adolescente? " + isTeenager);
        System.out.println("Juega " + gamingHoursPerWeek + " h y "
                + extraMinutes + " min a la semana");
        System.out.println("===============================");
    }
}
