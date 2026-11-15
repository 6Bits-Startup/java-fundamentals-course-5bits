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

    public double getAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public boolean isApproved() {
        return getAverage() >= 11;
    }

    public void showReport() {
        String status;
        if (isApproved()) {
            status = "[APROBADO]";
        } else {
            status = "[DESAPROBADO]";
        }
        System.out.printf("%s | Promedio: %.1f | %s%n", name, getAverage(), status);
    }
}

public class Main {
    static final int GRADES_PER_STUDENT = 3;
    static final double MIN_GRADE = 0;
    static final double MAX_GRADE = 20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes vas a registrar? ");
        int total = input.nextInt();
        input.nextLine(); // limpia el Enter que quedó pendiente

        if (total <= 0) {
            System.out.println("Debes registrar al menos un estudiante.");
            input.close();
            return;
        }

        Student[] students = new Student[total];

        for (int i = 0; i < total; i++) {
            System.out.println("\n--- Estudiante " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String name = input.nextLine();

            double[] grades = readGrades(input);
            students[i] = new Student(name, grades);
        }

        showClassReport(students);
        input.close();
    }

    static double[] readGrades(Scanner input) {
        double[] grades = new double[GRADES_PER_STUDENT];
        for (int j = 0; j < GRADES_PER_STUDENT; j++) {
            System.out.print("Nota " + (j + 1) + ": ");
            double grade = input.nextDouble();
            while (grade < MIN_GRADE || grade > MAX_GRADE) {
                System.out.print("Nota inválida (0 a 20). Intenta otra vez: ");
                grade = input.nextDouble();
            }
            grades[j] = grade;
        }
        input.nextLine(); // limpia el Enter antes de pedir el siguiente nombre
        return grades;
    }

    static Student findBestStudent(Student[] students) {
        Student best = students[0];
        for (Student student : students) {
            if (student.getAverage() > best.getAverage()) {
                best = student;
            }
        }
        return best;
    }

    static int countApproved(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student.isApproved()) {
                count++;
            }
        }
        return count;
    }

    static void showClassReport(Student[] students) {
        System.out.println("\n========== REPORTE DEL SALÓN ==========");
        for (Student student : students) {
            student.showReport();
        }
        System.out.println("=======================================");

        Student best = findBestStudent(students);
        System.out.printf(">>> Mejor promedio: %s (%.1f)%n", best.getName(), best.getAverage());
        System.out.println("Aprobados: " + countApproved(students) + " de " + students.length);
    }
}
