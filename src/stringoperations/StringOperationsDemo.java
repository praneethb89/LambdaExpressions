package stringoperations;

import java.util.Scanner;

public class StringOperationsDemo {

    public static void main(String[] args) {

        StringOperations operations = new StringOperations();
        Scanner scanner = new Scanner(System.in);

        String text = "  Java Lambda Expressions  ";
        String sentence = "Java Lambda Expressions are Powerful";
        String email = "student@example.com";

        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("\nEnter your choice (1-29 or 0 to exit): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Uppercase: "
                            + operations.upperCase().transform(text));
                    break;

                case 2:
                    System.out.println("Lowercase: "
                            + operations.lowerCase().transform(text));
                    break;

                case 3:
                    System.out.println("Reverse: "
                            + operations.reverse().transform(text));
                    break;

                case 4:
                    System.out.println("Length: "
                            + operations.length().count(text));
                    break;

                case 5:
                    System.out.println("\nCharacters:");
                    text.chars()
                            .forEach(c -> System.out.println((char)c));
                    break;

                case 6:
                    System.out.println("Trimmed: "
                            + operations.trim().transform(text));
                    break;

                case 7:
                    System.out.println("Replace Spaces: "
                            + operations.replaceSpaces().transform(text));
                    break;

                case 8:
                    System.out.println("Without Vowels: "
                            + operations.removeVowels().transform(text));
                    break;

                case 9:
                    System.out.println("Is Empty: "
                            + operations.isEmpty().check(text));
                    break;

                case 10:
                    System.out.println("Is Blank: "
                            + operations.isBlank().check(text));
                    break;

                case 11:
                    System.out.println("Starts With A: "
                            + operations.startsWithA().check(text));
                    break;

                case 12:
                    System.out.println("Ends With .java: "
                            + operations.endsWithJava().check(text));
                    break;

                case 13:
                    System.out.println("Contains Java: "
                            + operations.containsJava().check(text));
                    break;

                case 14:
                    System.out.println("Only Alphabets: "
                            + operations.onlyAlphabets().check(text));
                    break;

                case 15:
                    System.out.println("Only Digits: "
                            + operations.onlyDigits().check(text));
                    break;

                case 16:
                    System.out.println("Contains Special Characters: "
                            + operations.containsSpecialCharacters().check(text));
                    break;

                case 17:
                    System.out.println("Length > 10: "
                            + operations.lengthGreaterThan10().check(text));
                    break;

                case 18:
                    System.out.println("Palindrome: "
                            + operations.palindrome().check("madam"));
                    break;

                case 19:
                    System.out.println("Valid Email: "
                            + operations.emailCheck().check(email));
                    break;

                case 20:
                    System.out.println("Vowels: "
                            + operations.vowelCount().count(text));
                    break;

                case 21:
                    System.out.println("Consonants: "
                            + operations.consonantCount().count(text));
                    break;

                case 22:
                    System.out.println("Uppercase Letters: "
                            + operations.uppercaseCount().count(text));
                    break;

                case 23:
                    System.out.println("Lowercase Letters: "
                            + operations.lowercaseCount().count(text));
                    break;

                case 24:
                    System.out.println("Digits: "
                            + operations.digitCount().count(text));
                    break;

                case 25:
                    System.out.println("Word Count: "
                            + operations.wordCount().count(sentence));
                    break;

                case 26:
                    System.out.println("Longest Word: "
                            + operations.longestWord().find(sentence));
                    break;

                case 27:
                    System.out.println("Shortest Word: "
                            + operations.shortestWord().find(sentence));
                    break;

                case 28:
                    System.out.println("First Character: "
                            + operations.firstCharacter().find(text));
                    break;

                case 29:
                    System.out.println("Last Character: "
                            + operations.lastCharacter().find(text));
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 0-29.");
            }

            if (running) {
                System.out.println("\n" + "=".repeat(50));
                System.out.print("\nWhich case would you like to print? (1-10 or 0 to continue): ");
                int caseChoice = scanner.nextInt();
                if (caseChoice != 0) {
                    StringOperations.implementation(caseChoice);
                }
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("          STRING OPERATIONS MENU");
        System.out.println("=".repeat(50));
        System.out.println("1.  Uppercase");
        System.out.println("2.  Lowercase");
        System.out.println("3.  Reverse");
        System.out.println("4.  Length");
        System.out.println("5.  Display Characters");
        System.out.println("6.  Trimmed");
        System.out.println("7.  Replace Spaces");
        System.out.println("8.  Remove Vowels");
        System.out.println("9.  Is Empty");
        System.out.println("10. Is Blank");
        System.out.println("11. Starts With A");
        System.out.println("12. Ends With .java");
        System.out.println("13. Contains Java");
        System.out.println("14. Only Alphabets");
        System.out.println("15. Only Digits");
        System.out.println("16. Contains Special Characters");
        System.out.println("17. Length > 10");
        System.out.println("18. Palindrome Check");
        System.out.println("19. Valid Email");
        System.out.println("20. Vowel Count");
        System.out.println("21. Consonant Count");
        System.out.println("22. Uppercase Letter Count");
        System.out.println("23. Lowercase Letter Count");
        System.out.println("24. Digit Count");
        System.out.println("25. Word Count");
        System.out.println("26. Longest Word");
        System.out.println("27. Shortest Word");
        System.out.println("28. First Character");
        System.out.println("29. Last Character");
        System.out.println("0.  Exit");
        System.out.println("=".repeat(50));
    }
}
