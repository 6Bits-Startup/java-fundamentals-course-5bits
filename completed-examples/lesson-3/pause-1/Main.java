public class Main {

    static double rectangleArea(double base, double height) {
        return base * height;
    }

    public static void main(String[] args) {
        double area = rectangleArea(4.5, 2);
        System.out.println("El área es: " + area);   // 9.0
    }
}
