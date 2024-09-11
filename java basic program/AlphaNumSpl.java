import java.util.Scanner;

public class AlphaNumSpl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int alphabetCount = 0, numberCount = 0, specialCharCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphabetCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else if (ch != ' ') { // Ignore spaces
                specialCharCount++;
            }
        }

        System.out.println("Number of Alphabets: " + alphabetCount);
        System.out.println("Number of Numbers: " + numberCount);
        System.out.println("Number of Special Characters: " + specialCharCount);
    }
}
