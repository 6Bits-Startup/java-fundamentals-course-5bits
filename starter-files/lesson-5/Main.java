import java.util.Scanner;

class Student {
    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    // TODO 1: devuelve el promedio de las notas (suma con for-each y divide)
    public double getAverage() {
        return 0;
    }

    // TODO 2: devuelve true si el promedio es 11 o más
    public boolean isApproved() {
        return false;
    }

    public void showReport() {
        String status = isApproved() ? "[APROBADO]" : "[DESAPROBADO]";
        System.out.printf("%s | Promedio: %.1f | %s%n", name, getAverage(), status);
    }
}

public class Main {
    static final int GRADES_PER_STUDENT = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes vas a registrar? ");
        int total = input.nextInt();
        input.nextLine(); // limpia el Enter que quedó pendiente

        Student[] students = new Student[total];

        for (int i = 0; i < total; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            String name = input.nextLine();

            double[] grades = new double[GRADES_PER_STUDENT];
            for (int j = 0; j < GRADES_PER_STUDENT; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                grades[j] = input.nextDouble();
                // TODO 3: si la nota no está entre 0 y 20, vuelve a pedirla con un while
            }
            input.nextLine();
            students[i] = new Student(name, grades);
        }

        System.out.println("\n===== REPORTE DEL SALÓN =====");
        for (Student student : students) {
            student.showReport();
        }
        // TODO 4: muestra cuántos estudiantes aprobaron y quién tiene el mejor promedio
        input.close();
    }
}
