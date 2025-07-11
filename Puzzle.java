import java.util.*;

public class Puzzle{

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String[] words;
boolean happy = false;

while (!happy) {
// 1. Ask how many words
int numWords = 0;
while (numWords < 3 || numWords > 5) {
System.out.print("How many words would you like to enter? (3-5): ");
numWords = scanner.nextInt();
scanner.nextLine(); 
}

words = new String[numWords];

// 2. Input and clean words
for (int i = 0; i < numWords; i++) {
System.out.printf("Enter word %d: ", i + 1);
String input = scanner.nextLine().trim();
words[i] = capitalize(input);
}

// 9. Sort and display alphabetically
Arrays.sort(words);
System.out.println("\nHere are your words:");
for (int i = 0; i < words.length; i++) {
System.out.printf("%d. %s\n", i + 1, words[i]);
}

// 3. Choose two numbers
int firstIndex = 0, secondIndex = 0;
boolean validChoice = false;

while (!validChoice) {
System.out.print("\nChoose two numbers to create your password (e.g., 1 and 3): ");
try {
firstIndex = scanner.nextInt();
secondIndex = scanner.nextInt();
scanner.nextLine(); // consume newline
if (firstIndex >= 1 && firstIndex <= words.length &&
secondIndex >= 1 && secondIndex <= words.length &&
firstIndex != secondIndex) {
validChoice = true;
} else {
System.out.println("Invalid choices. Pick two different valid numbers.");
}
} catch (InputMismatchException e) {
System.out.println("Please enter valid integers.");
scanner.nextLine(); // clear buffer
}
}

String word1 = words[firstIndex - 1];
String word2 = words[secondIndex - 1];

// 8. Let user choose special symbol
System.out.print("Choose a special character (@, #, $, %, !): ");
String symbol = scanner.nextLine().trim();
if (symbol.length() == 0) symbol = "@";
char specialChar = symbol.charAt(0);

// 4. Create password
StringBuilder reversed = new StringBuilder(word1).reverse();
String partTwo = word2.length() >= 3 ? word2.substring(0, 3) : word2;
int totalLength = word1.length() + word2.length();

String password = reversed.toString() + specialChar + partTwo + totalLength;

// 5. Check if starts with vowel
boolean startsWithVowel = false;
char firstChar = password.charAt(0);
if ("aeiouAEIOU".indexOf(firstChar) != -1) {
startsWithVowel = true;
}

// 6. Final output
System.out.println("\n" + String.format("Your generated password is: %s", password));
if (startsWithVowel) {
System.out.println("Starts with a vowel? Yes");
} else {
System.out.println("Starts with a vowel? No");
}

// 7. Loop until satisfied
System.out.print("\nAre you happy with this password? (yes/no): ");
String response = scanner.nextLine().trim().toLowerCase();
if (response.equals("yes") || response.equals("y")) {
happy = true;
System.out.println("Password accepted. Goodbye!");
} else {
System.out.println("\nLet's try again!\n");
}
}
}

// Helper to capitalize first letter and lower the rest
private static String capitalize(String str) {
if (str == null || str.isEmpty()) return str;
return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
}
}