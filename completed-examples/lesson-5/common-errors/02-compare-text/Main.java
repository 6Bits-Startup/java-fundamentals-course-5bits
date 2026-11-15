import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Contraseña: ");
        String password = input.nextLine();

        // ERROR COMÚN: if (password == "gato123") compara si es el MISMO objeto,
        // no si tiene el mismo texto, y puede decir "Incorrecta" aunque escribas bien.
        if (password.equals("gato123")) {   // correcto: compara el contenido
            System.out.println("Correcta");
        } else {
            System.out.println("Incorrecta");
        }
        input.close();
    }
}
