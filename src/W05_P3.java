import java.util.Scanner;

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

public class W05_P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            String text = input.nextLine();

            System.out.println("Original string: " + text);
            checkVowels(text);
            System.out.print("String contains vowels.");
        } catch (NoVowelsException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
    public static void checkVowels(String text) throws NoVowelsException {
        // Convert the string to lowercase for uniformity
        String lowerCaseText = text.toLowerCase();

        // Check for vowels
        boolean hasVowel = false;
        for (char c : lowerCaseText.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowel = true;
                break;
            }
        }

        // Throw exception if no vowels are found
        if (!hasVowel) {
            throw new NoVowelsException("String does not contain any vowels.");
        }
    }
}