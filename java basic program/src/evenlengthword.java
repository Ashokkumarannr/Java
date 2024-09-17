import java.util.Scanner;

public class evenlengthword {
    public static void printWords(String s){
        // Split the sentence into words using space as the delimiter
        for(String word : s.split(" ")) {
            // Check if the word's length is even
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        // Use in.nextLine() to capture the entire sentence
        String s = in.nextLine();
        printWords(s);
    }
}

