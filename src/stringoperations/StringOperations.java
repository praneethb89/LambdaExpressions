package stringoperations;

import stringoperations.interfaces.StringChecker;
import stringoperations.interfaces.StringCounter;
import stringoperations.interfaces.StringFinder;
import stringoperations.interfaces.StringTransformer;

public class StringOperations {

    public StringTransformer upperCase() {
        return str -> str.toUpperCase();
    }


    public StringTransformer lowerCase() {
        return str -> str.toLowerCase();
    }


    public StringTransformer reverse() {
        return str -> new StringBuilder(str)
                .reverse()
                .toString();
    }


    public StringCounter length() {
        return str -> str.length();
    }


    public StringTransformer trim() {
        return str -> str.trim();
    }


    public StringTransformer replaceSpaces() {
        return str -> str.replace(" ", "_");
    }


    public StringTransformer removeVowels() {
        return str -> str.replaceAll("[AEIOUaeiou]", "");
    }


    public StringChecker isEmpty() {
        return str -> str.isEmpty();
    }


    public StringChecker isBlank() {
        return str -> str.isBlank();
    }


    public StringChecker startsWithA() {
        return str -> str.startsWith("A");
    }


    public StringChecker endsWithJava() {
        return str -> str.endsWith(".java");
    }


    public StringChecker containsJava() {
        return str -> str.contains("Java");
    }


    public StringChecker onlyAlphabets() {
        return str -> str.matches("[a-zA-Z]+");
    }


    public StringChecker onlyDigits() {
        return str -> str.matches("\\d+");
    }


    public StringChecker containsSpecialCharacters() {
        return str -> !str.matches("[a-zA-Z0-9 ]*");
    }


    public StringChecker lengthGreaterThan10() {
        return str -> str.length() > 10;
    }


    public StringChecker palindrome() {
        return str -> str.equalsIgnoreCase(
                new StringBuilder(str)
                        .reverse()
                        .toString()
        );
    }


    public StringChecker emailCheck() {
        return str -> str.matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
        );
    }


    public StringCounter vowelCount() {
        return str -> {

            int count = 0;

            for(char ch : str.toCharArray()) {

                if("AEIOUaeiou".indexOf(ch) != -1) {
                    count++;
                }
            }

            return count;
        };
    }


    public StringCounter consonantCount() {
        return str -> {

            int count = 0;

            for(char ch : str.toCharArray()) {

                if(Character.isLetter(ch)
                        && "AEIOUaeiou".indexOf(ch) == -1) {
                    count++;
                }
            }

            return count;
        };
    }


    public StringCounter uppercaseCount() {
        return str -> {

            int count = 0;

            for(char ch : str.toCharArray()) {

                if(Character.isUpperCase(ch)) {
                    count++;
                }
            }

            return count;
        };
    }


    public StringCounter lowercaseCount() {
        return str -> {

            int count = 0;

            for(char ch : str.toCharArray()) {

                if(Character.isLowerCase(ch)) {
                    count++;
                }
            }

            return count;
        };
    }


    public StringCounter digitCount() {
        return str -> {

            int count = 0;

            for(char ch : str.toCharArray()) {

                if(Character.isDigit(ch)) {
                    count++;
                }
            }

            return count;
        };
    }


    public StringCounter wordCount() {
        return str -> str.trim()
                .split("\\s+")
                .length;
    }


    public StringFinder longestWord() {

        return str -> {

            String longest = "";

            String[] words = str.split(" ");

            for(String word : words) {

                if(word.length() > longest.length()) {
                    longest = word;
                }
            }

            return longest;
        };
    }


    public StringFinder shortestWord() {

        return str -> {

            String shortest = str.split(" ")[0];

            String[] words = str.split(" ");

            for(String word : words) {

                if(word.length() < shortest.length()) {
                    shortest = word;
                }
            }

            return shortest;
        };
    }


    public StringFinder firstCharacter() {
        return str -> String.valueOf(str.trim().charAt(0));
    }


    public StringFinder lastCharacter() {
        return str -> String.valueOf(
                str.trim().charAt(str.trim().length() - 1)
        );
    }

    public static void implementation(int choice) {
        StringOperations operations = new StringOperations();
        String text = "  Java Lambda Expressions  ";
        String sentence = "Java Lambda Expressions are Powerful";

        switch(choice) {
            case 1:
                System.out.println("Uppercase: " + operations.upperCase().transform(text));
                break;
            case 2:
                System.out.println("Lowercase: " + operations.lowerCase().transform(text));
                break;
            case 3:
                System.out.println("Reverse: " + operations.reverse().transform(text));
                break;
            case 4:
                System.out.println("Length: " + operations.length().count(text));
                break;
            case 5:
                System.out.println("Trimmed: " + operations.trim().transform(text));
                break;
            case 6:
                System.out.println("Replace Spaces: " + operations.replaceSpaces().transform(text));
                break;
            case 7:
                System.out.println("Remove Vowels: " + operations.removeVowels().transform(text));
                break;
            case 8:
                System.out.println("Vowels: " + operations.vowelCount().count(text));
                break;
            case 9:
                System.out.println("Consonants: " + operations.consonantCount().count(text));
                break;
            case 10:
                System.out.println("Longest Word: " + operations.longestWord().find(sentence));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
