import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Edad: ");
        int age = input.nextInt();
        // ERROR COMÚN: sin la siguiente línea, el Enter que quedó después del número
        // lo lee el nextLine() del nombre, y el nombre queda vacío ("Hola , tienes 12").
        input.nextLine();   // limpia el Enter pendiente

        System.out.print("Nombre: ");
        String name = input.nextLine();
        System.out.println("Hola " + name + ", tienes " + age);
        input.close();
    }
}
