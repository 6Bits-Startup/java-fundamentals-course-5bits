public class Main {

    static int countVowels(String text) {
        String vowels = "aeiouáéíóú";
        String lowerText = text.toLowerCase();
        int count = 0;

        for (int i = 0; i < lowerText.length(); i++) {
            char letter = lowerText.charAt(i);
            if (vowels.indexOf(letter) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Programar es genial"));   // 7
    }
}
