import java.util.Scanner;

public class stringalpabets {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string:");
            String input = in.nextLine();

            for (int i = 0; i < input.length(); i++) {
                char let = input.charAt(i);
                if (Character.isLetter(let)) {
                    System.out.println(let + " is an alphabet.");
                } else {
                    System.out.println(let + " is not an alphabet.");
                }
            }
        }
    }

