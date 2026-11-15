public class Main {
    public static void main(String[] args) {
        // ----- Datos del perfil -----
        String name = "Valeria";
        int birthYear = 2011;
        int currentYear = 2026;
        double height = 1.58;
        boolean likesMusic = true;
        int gamingMinutesPerDay = 45;

        // ----- Cálculos -----
        int age = currentYear - birthYear;
        int ageInFiveYears = age + 5;
        int gamingMinutesPerWeek = gamingMinutesPerDay * 7;
        int gamingHoursPerWeek = gamingMinutesPerWeek / 60;
        int extraMinutes = gamingMinutesPerWeek % 60;
        boolean isTeenager = age >= 13;

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
