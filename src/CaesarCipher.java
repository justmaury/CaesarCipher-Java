
import java.util.Scanner;

public class CaesarCipher {

    // Step 1: Encryption method
    public static String encrypt(String text, int shift) {

        StringBuilder result = new StringBuilder();

        // Step 2: Visit each character
        for (char character : text.toCharArray()) {

            // Step 3: Check whether character is a letter
            if (Character.isLetter(character)) {

                char base = Character.isLowerCase(character) ? 'a' : 'A';

                // Step 4: Apply Caesar Cipher formula
                char shifted = (char) (
                        (character - base + shift) % 26 + base
                );

                result.append(shifted);

            } else {

                result.append(character);
            }
        }

        return result.toString();
    }

    // Step 5: Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to encrypt: ");
        String inputText = scanner.nextLine();

        System.out.print("Enter shift key (0-25): ");
        int shiftKey = scanner.nextInt();

        String encrypted = encrypt(inputText, shiftKey);

        System.out.println("Encrypted text: " + encrypted);

        scanner.close();
    }
}
