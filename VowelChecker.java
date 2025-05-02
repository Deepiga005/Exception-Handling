package JavaProgm;

import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            checkVowels(input);
            System.out.println("The string contains vowels!");
        } catch (NoVowelException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void checkVowels(String str) throws NoVowelException {
        if (!str.toLowerCase().matches(".*[aeiou].*")) {
            throw new NoVowelException("The string does not contain any vowels.");
        }
    }
}

class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}