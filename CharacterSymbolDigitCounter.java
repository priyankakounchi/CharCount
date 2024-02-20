package Task1;

import java.util.Scanner;

public class CharacterSymbolDigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the code:");
        String code = scanner.nextLine();

        int charCount = 0;
        int symbolCount = 0;
        int digitCount = 0;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (Character.isLetter(ch)) {
                charCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                symbolCount++;
            }
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Symbol count: " + symbolCount);
        System.out.println("Digit count: " + digitCount);
    }
}
