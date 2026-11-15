public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int result = add(8, 5);
        System.out.println("8 + 5 = " + result);                         // 13

        System.out.println("30 °C = " + celsiusToFahrenheit(30) + " °F");  // 86.0
        System.out.println("¿7 es par? " + isEven(7));                    // false
        System.out.println("¿10 es par? " + isEven(10));                  // true
    }
}
